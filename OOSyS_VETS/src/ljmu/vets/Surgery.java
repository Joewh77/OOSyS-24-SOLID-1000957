package ljmu.vets;

/** Represents surgery option with all the functionality of it.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate; //^^ Added to allow LocalDate to function.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Surgery implements Serializable {
	private String surgery;
	private List<Pet> pets = new ArrayList<Pet>();
	private List<Booking> bookings = Collections.synchronizedList(new ArrayList<Booking>());

	// Attributes added for JUnit assertThrows
	private String embargoDay;
	private String DayOfWeek;

	// Alter current constructor to include DayOfWeek & embargoDay
	public Surgery(String surgery, String DayOfWeek, String embargoDay) {
        this.surgery = surgery;
        this.embargoDay = embargoDay;
        this.DayOfWeek = DayOfWeek;
    }

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " >> " + this.surgery;
	}

	// ToDo : get / set Methods ?

	// ToDo : Validate ? // Validation added.
	public void makePet(Pet pet) {
		if (pet != null) {
		this.pets.add(pet);
	}

	//^^
	public void makePet(String name, LocalDate regDate) {
		// ToDo : Validate ?
	}
	

	public Pet getPetByName(String name) {
		// NOTE : Java SE 7 Code !
		for (Pet p : this.pets) {
			if (p.getName().equals(name)) {
				return p;
			}
		}

		/* NOTE : Java SE 8 Code !
		Optional<Pet> p = this.pets.stream().filter(o -> o.getName().equals(name)).findAny();
		if (p.isPresent()) {
			return p.get();
		}
		*/

		// NOTE : No Match !
		return null;
	}

	public  void makeBooking(Booking booking) throws Exception {
        // NOTE : Validate ?
        if (booking.getWhen().getDayOfWeek().toString().equalsIgnoreCase (this.embargoDay)) {
            this.bookings.add(booking);
        }
        else {
            throw new Exception("makeBooking :(");
        }

        // NOTE : Two-Way Linking ?
        booking.getPet().makeBooking(booking);
    }

	
	public void makeBooking(String ref, Pet pet, LocalDateTime when) {
		// ToDo : Validate ?
		this.makeBooking( new Booking(ref, pet, when));
	}
	

	// ToDo : getBookingByRef() ?
}
