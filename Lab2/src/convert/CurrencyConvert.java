package convert;

import java.util.Scanner;

public class CurrencyConvert {
	
	public double dollarToInr(double x)
	 {
		 return x*68.58;
	 }
	
	 public double inrToDollar(double x)
	 {
		 return x*0.015;
	 }
	
	public double dispC()
	{
		Scanner ip = new Scanner(System.in);
		int x;
		double a,b = 0.0;
		System.out.print("\n 1. Dollar to INR \n 2. INR to Dollar ");
		System.out.print("\n\n Enter quantity = ");
		a = ip.nextDouble();
		System.out.print("\n Choose option = ");
		x = ip.nextInt();
		switch(x)
		{
		case 1: b = dollarToInr(a); break;
		case 2: b = inrToDollar(a); break;
		default : System.out.print("\n Wrong Choice!");
		}
		ip.close();
		return(b);
	}
	 
}
