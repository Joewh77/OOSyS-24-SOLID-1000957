package ljmu.vets;

/** Represents Booking functions and system.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking implements Serializable {
	private String ref;
	private Pet pet;
	private LocalDateTime when;
	private Integer duration;

	public Booking(String ref, Pet pet, LocalDateTime when, Integer duration) {
		this.ref = ref;
		this.pet = pet;
		this.when = when;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " >> " +
				this.ref + " " +
				this.pet.toString() + " " +
				this.when.format(DateTimeFormatter.ofPattern("dd MMM yy HH:mm"));
	}

	public String getRef() {
		return this.ref;
	}
	
	public void setRef(String ref) {
		this.ref = ref;
	}

	public Pet getPet() {
		return this.pet;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public LocalDateTime getWhen() {
		return this.when;
	}
	
	public void setWhen(LocalDateTime when) {
		this.when = when;
	}

	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	// ToDo : get / set Methods ? // Set methods added for each Get method.
}
