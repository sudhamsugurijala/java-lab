package convert;
import java.util.Scanner;

public class DistanceConvert {
	
	 public double mToKm(double x)
	 {
		 return x/1000;
	 }
	 
	 public double kmToM(double x)
	 {
		 return x*1000;
	 }
	 
	 public double mileToKm(double x)
	 {
		 return x*1.60934;
	 }
	 
	 public double kmToMile(double x)
	 {
		 return x*0.621371;
	 }
	
	public double dispD()
	{
		Scanner ip = new Scanner(System.in);
		int x;
		double a,b = 0.0;
		System.out.print("\n 1. M to KM \n 2. KM to M \n 3. Mile to KM");
		System.out.print("\n 4. KM to Mile");
		System.out.print("\n\n Enter quantity = ");
		a = ip.nextDouble();
		System.out.print("\n Choose option = ");
		x = ip.nextInt();
		switch(x)
		{
		case 1: b = mToKm(a); break;
		case 2: b = kmToM(a); break;
		case 3: b = mileToKm(a); break;
		case 4: b = kmToMile(a); break;
		default : System.out.print("\n Wrong Choice!");
		}
		ip.close();
		return b;
	} 
	
}
