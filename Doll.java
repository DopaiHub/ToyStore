/**
 * Doll class  extends toy, type of toy
 * @author Adam Nguyen
 *
 */
public class Doll extends Toy{
	/**
	 * Sets name to doll
	 */
	public Doll()
	{
		name="Doll";
	}
	/**
	 * Calls assemble method from toy and then assembles the doll
	 */
	public void assemble()
	{
		super.assemble();
		System.out.println("Connecting all pieces\nPainting the face\nAdding the dress\nAdding the shoes");
	}
	

}
