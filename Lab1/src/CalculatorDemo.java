
public class CalculatorDemo {

	public static void main(String[] args) {
		double a,b;
		char op;
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[2]);
		op = args[1].charAt(0);
		switch(op) {
		case '+': System.out.println(String.format(" \n Answer = %.2f",a+b)); break;
		case '-': System.out.println(String.format(" \n Answer = %.2f",a-b)); break;
		case '*': System.out.println(String.format(" \n Answer = %.2f",a*b)); break;
		case '/': System.out.println(String.format(" \n Answer = %.2f",a/b)); break;
		default: System.out.println();
		}
	}

}
