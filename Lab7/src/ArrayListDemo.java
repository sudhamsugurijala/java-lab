import java.util.*;

public class ArrayListDemo {
	
	public static void p(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		  ArrayList<String> al = new ArrayList<String>();
		  int opt,x;	String s;	char c='y';
		  Scanner ip = new Scanner(System.in);
		  p("\n MENU\n ====");
		  p("\n 1. Append\n 2. Insert\n 3. Search");
		  p(" 4. List all strings starting with given letter");
		  while(c=='y'||c=='Y') {
			  System.out.print("\n Enter choice : ");
			  opt = ip.nextInt();
			  switch(opt) {
			  case 1:	System.out.print(" Enter string : ");
			  			s = ip.next();
			  			al.add(s); 
			  			p(" Size of al after additions: " + al.size());
			  			p(" Contents of al: " + al); break;
			  case 2:	System.out.print(" Enter string : ");
			  			s = ip.next();
			  			System.out.print(" Enter index : ");
			  			x = ip.nextInt();
			  			al.add(x,s);
			  			p(" Size of al after additions: " + al.size());
			  			p(" Contents of al: " + al); break;
			  case 3:	System.out.print(" Enter string to search : ");
			  			s = ip.next();
			  			x = al.indexOf(s);
			  			p(" "+s+" found at index : "+x); break;
			  case 4:	System.out.print(" Enter letter : ");
			  			c = ip.next().charAt(0);
			  			for(x=0;x<al.size();x++)
			  				if(al.get(x).charAt(0) == c) p(" "+al.get(x));
			  			break;
			  default:  p(" Wrong choice!");break;
			  }
			  System.out.print(" Continue ? (Y/N) : ");
			  c = ip.next().charAt(0);
		 }
		 ip.close();
	}

}
