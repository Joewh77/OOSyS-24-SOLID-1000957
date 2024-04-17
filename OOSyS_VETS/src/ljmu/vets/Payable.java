package ljmu.vets;

/** Represents payable which is used to get surgery costs.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

public interface Payable {
	public Double getSurgeryCost();
	public Double getPublicCost() throws Exception;
}
