package ljmu.vets;

/** Represents pets an pet types used in the program.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Pet implements Serializable {
	protected String name;
	protected LocalDate regDate;

	// ToDo : Private ?
	protected List<Booking> bookings = new ArrayList<Booking>();

	public Pet(String name, LocalDate regDate) {
		this.name = name;
		this.regDate = regDate;
	}

	public void makeBooking(Booking when) {
		this.bookings.add(when);
	}

	public Booking getNextBooking() {
		return this.bookings.stream()
			.filter(o -> o.getWhen().isAfter(LocalDateTime.now()))
				.sorted(Comparator.comparing(o -> o.getWhen()))
					.findFirst().get();
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRegDate() {
		return this.regDate;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	// ToDo : get / set Methods ? // Get methods added for getName & getRegDate.
}
