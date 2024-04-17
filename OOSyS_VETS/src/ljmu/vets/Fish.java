package ljmu.vets;

/** Represents a type of pet (fish).
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fish extends Pet {
	private WaterType waterType;

	public Fish(String name, LocalDate regDate, WaterType waterType) {
		super(name, regDate);

		this.waterType = waterType;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " >> " +
				this.name + " " +
				this.regDate.format(DateTimeFormatter.ofPattern("dd MMM yy")) + " " +
				this.waterType.toString();
	}

	// ToDo : get / set Methods ?
}
