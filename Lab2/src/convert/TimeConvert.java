package convert;
import java.util.Scanner;

public class TimeConvert {
	
	public double hrToMin(double x)
	 {
		 return x*60;
	 }
	 
	 public double minToHr(double x)
	 {
		 return x/60;
	 }
	 
	 public double hrToSec(double x)
	 {
		 return x*3600;
	 }
	 
	 public double secToHr(double x)
	 {
		 return x/3600;
	 }
	 
	 public double minToSec(double x)
	 {
		 return x*60;
	 }
	 
	 public double secToMin(double x)
	 {
		 return x/60;
	 }
	
	public double dispT()
	{
		Scanner ip = new Scanner(System.in);
		int x;
		double a,b=0.0;
		System.out.print("\n 1. Hour to Min \n 2. Min to Hour \n 3. Hour to Seconds");
		System.out.print("\n 4. Seconds to Hours \n 5. Min to Sec");
		System.out.print("\n 6. Seconds to Minutes");
		System.out.print("\n\n Enter quantity = ");
		a = ip.nextDouble();
		System.out.print("\n Choose option = ");
		x = ip.nextInt();
		switch(x)
		{
		case 1: b = hrToMin(a); break;
		case 2: b = minToHr(a); break;
		case 3: b = hrToSec(a); break;
		case 4: b = secToHr(a); break;
		case 5: b = minToSec(a); break;
		case 6: b = secToMin(a); break;
		default : System.out.print("\n Wrong Choice!");
		}
		ip.close();
		return b;
	} 
	 
}