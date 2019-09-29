/**
 * Factory for toys
 * @author Adam Nguyen
 *
 */
public class ToyStore {
	/**
	 * Method creates a toy and orders it based on string type
	 * @param type
	 * @return toy
	 */
	public Toy orderToy(String type)
	{
		Toy toy=new Doll();
		if(type.equalsIgnoreCase("doll"))
			toy=new Doll();
		else if(type.equalsIgnoreCase("car"))
			toy=new Car();
		else if(type.equalsIgnoreCase("rattle"))
			toy=new Rattle();
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		return toy;
	}

}
