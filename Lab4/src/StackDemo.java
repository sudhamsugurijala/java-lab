import java.util.Scanner;

interface stack {
	void push(int x);
	void pop();
}

class StackADT implements stack {
	protected int top,size,capacity,s[];
	/*StackADT() {
		top=-1;
		size=0;capacity=7;
	}*/
	StackADT(int c){
		top=-1;
		size=0; capacity=c;
		s = new int[c];
	}
	public void push(int x) {
		if(size==capacity) System.out.println("\n Stack Full!");
		if(top==-1) top=0;
		else top++;
		s[top]=x;  size++;
	}
	public void pop() {
		int x;
		if(top==-1) System.out.println("\n Empty Stack!");
		else {  
			x = s[top]; s[top] = 0;
			top--;  size--;
			System.out.println(" Element popped : "+x);
		}
	}
	public void displayStack() {
		int i;
		if(size==0) {
			System.out.println("\n Empty Stack!");
			return;
		}
		System.out.println("\n Stack Status : (bottom to top)");
		for(i=0;i<=top;i++)  System.out.print(" "+s[i]);
	}
	public void stackMenu() {
		char ch='y';
		Scanner ip = new Scanner(System.in);
		int x,opt;
		System.out.println("\n MENU\n ====");
		System.out.println("\n 1. Push\n 2. Pop\n 3. Display Stack");
		while(ch=='y'||ch=='Y') {
			System.out.print("\n Enter choice : ");
			opt = ip.nextInt();
			switch(opt) {
				case 1: System.out.print(" Enter element to push : ");
						x = ip.nextInt();
						push(x); break;
				case 2: pop(); break;
				case 3: displayStack(); break;
				default: break;
			}
			System.out.print("\n Try Again?(Y/N) : ");
			ch = ip.next().charAt(0);
		}
		ip.close();
	}
}
public class StackDemo {

	public static void main(String[] args) {
		int cap;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter maximum capacity of stack : ");
		cap = ip.nextInt();
		StackADT stack = new StackADT(cap);
		stack.stackMenu();
		ip.close();

	}

}
