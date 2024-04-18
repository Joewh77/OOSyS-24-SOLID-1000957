package ljmu.vets;

/** Represents public medicine which includes stock and prices of it.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

public class PublicMedicine extends SurgeryOnlyMedicine {
	private Double publicCost;

	public PublicMedicine(String name, Integer stock, Integer lowest, Double surgeryCost, Double publicCost) {
		super(name, stock, lowest, surgeryCost, publicCost);

		this.publicCost = publicCost;
	}

	@Override
	public void setStock(Integer i) {
		this.stock = i;
	}

	@Override
	public Double getPublicCost() {
		return this.publicCost;
	}

	public void setPublicCost(Double publicCost) {
		this.publicCost = publicCost;
	}

	// ToDo : get / set Methods ? // Added set method.
}
