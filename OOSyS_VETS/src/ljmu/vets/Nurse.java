package ljmu.vets;

/** Represents nurse functions and implements notifiable.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

public class Nurse implements Notifiable {
	private String name;

	public Nurse(String n) {
		this.name = n;
	}

	@Override
	public void notifyy(String s) {
		System.out.println(this.name + " KNOWS ABOUT " + s);
	}
}
