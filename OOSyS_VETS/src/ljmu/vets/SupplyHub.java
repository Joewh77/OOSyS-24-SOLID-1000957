package ljmu.vets;

/** Represents the supply hub.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

public class SupplyHub implements Notifiable {
	private String name;

	public SupplyHub(String n) {
		this.name = n;
	}

	@Override
	public void notifyy(String s) {
		System.out.println(this.name + " KNOWS ABOUT " + s);
	}
}
