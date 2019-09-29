/**
 * Rattle class extends toy, type of toy
 * @author Adam Nguyen
 *
 */
public class Rattle extends Toy{
	/**
	 * sets name to Rattle
	 */
	public Rattle()
	{
		name="Rattle";
	}
	/**
	 * calls toy assemble method then assembles the rattle
	 */
	public void assemble()
	{
		super.assemble();
		System.out.println("Create the frame\nAdd the pebbles\nSecure the sides");
	}

}
