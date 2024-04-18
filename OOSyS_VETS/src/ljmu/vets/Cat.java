package ljmu.vets;

/** Represents one of the pet types (cat).
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cat extends Pet {
	private Breeding breeding;
	
	public Cat(String name, LocalDate regDate, Breeding breeding) {
		super(name, regDate);

		this.breeding = breeding;
	}
	
	// Get method added for breeding.
	public Breeding getBreeding() {
		return breeding;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " >> " +
				this.name + " " +
				this.regDate.format(DateTimeFormatter.ofPattern("dd MMM yy")) + " " +
				this.breeding.toString();
	}

	// ToDo : get / set Methods ?
}
