package ljmu.vets;

/** Represents the surgeries private medicine.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SurgeryOnlyMedicine implements Payable, Serializable {
	protected String name;
	protected Integer stock, lowest;
	protected Double surgeryCost;
	protected Double publicCost;
	protected List<Notifiable> people = new ArrayList<Notifiable>();

	public SurgeryOnlyMedicine(String name, Integer stock, Integer lowest, Double surgeryCost, Double publicCost) {
		this.name = name;
		this.stock = stock;
		this.lowest = lowest;
		this.surgeryCost = surgeryCost;		
		this.publicCost = publicCost;
	}

	public void setStock(Integer i) {
		this.stock = i;

		if (i < lowest) {
			notifyPeople();
		}
	}

	public void addNotifiable(Notifiable n) {
		this.people.add(n);
	}

	private void notifyPeople() {
		for	(Notifiable n : people) {
			n.notifyy(this.stock + " LEFT OF " + this.name);
		}
	}	

	@Override
	public Double getSurgeryCost() {
		return this.surgeryCost;
	}

	public void setSurgeryCost(Double SurgeryCost) {
		this.surgeryCost = SurgeryCost;
	}

	@Override
	public Double getPublicCost() throws Exception {
		throw new Exception("ToDo");
	}

	public void setPublicCost(Double PublicCost) {
		this.publicCost = PublicCost;
	}

	// ToDo : get / set Methods ? // Set methods added for 2 attributes.
}
