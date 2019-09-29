/**
 * Toy class has methods assemble,boxToy, and priceToy
 * @author Adam Nguyen
 *
 */
public abstract class Toy {
	/*
	 * protected String name, given to sub classes
	 */
	protected String name;
	/*
	 * assembles toy
	 */
	public void assemble()
	{
		System.out.println("Putting together a "+name);
	}
	/**
	 * boxes toy
	 */
	public void boxToy()
	{
		System.out.println("putting the "+name+" in a box");
	}
	/**
	 * adds price to toy
	 */
	public void priceToy()
	{
		System.out.println("adding price on "+name);
	}

}
