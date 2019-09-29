/**
 * Car class extends toy, type of toy
 * @author Adam Nguyen
 *
 */
public class Car extends Toy {

	/**
	 * Name is set to Car
	 */
	public Car()
	{
		name="Car";
	}
	/**
	 * calls assemble from Toy and then assembles the car
	 */
	public void assemble()
	{
		super.assemble();
		System.out.println("Make the body\nAdd the wheels\nPaint the car");
	}
}
