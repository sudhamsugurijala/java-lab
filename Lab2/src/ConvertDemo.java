import convert.*;
import java.util.Scanner;

public class ConvertDemo {

	public static void main(String[] args) {
		int opt1;
		double x=0.0;
		Scanner ip = new Scanner(System.in);
		CurrencyConvert r = new CurrencyConvert();
		DistanceConvert m = new DistanceConvert();
		TimeConvert s = new TimeConvert();
		System.out.print("\n 1. Currency Convertion");
		System.out.print("\n 2. Distance Convertion");
		System.out.print("\n 3. Time Convertion");
		System.out.print("\n Enter option = ");
		opt1 = ip.nextInt();
		switch(opt1)
		{
		case 1: x = r.dispC(); break;
		case 2: x = m.dispD(); break;
		case 3: x = s.dispT(); break;
		default : System.out.print("\n Wrong Choice!");
		}
		ip.close();
		System.out.print("\n Conversion Result = "+x);
	}

}