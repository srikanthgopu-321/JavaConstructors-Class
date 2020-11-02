import java.util.ArrayList;

//class name
public class Charge
{
	//instance variables
	private final double rx, ry;
	private final double q;

	//constructor
	public Charge (double x0, double y0, double q0)
	{
		rx = x0; ry = y0; q=q0;
	}

	//instance methods
	public double potentialAt(double x, double y)
	{
		double k = 8.99e09;
		double dx = x - rx; //instance variable names
		double dy = y - ry;
		return k * q / Math.sqrt(dx*dx + dy*dy);
	}

	//instance methods
	public String toString()
	{
		return q +" at " + "("+ rx + ", " + ry +")";
	}

	//test client
	public static void main (String[] args)
	{
		double x = Double.parseDouble(args[0]);
                double y = Double.parseDouble(args[1]);

		//create and initialize object
		Charge c1 = new Charge(0.51, 0.63, 21.3); //invoke constructor
                Charge c2 = new Charge(0.13, 0.94, 81.9);
		double v1 = c1.potentialAt(x,y); //invoke method
                double v2 = c2.potentialAt(x,y);
		System.out.println( (v1 + v2));
	}
}
