import java.util.Scanner;

interface queue {
	void enqueue(int x);
	void dequeue();
}

class QueueADT implements queue {
	protected int front,rear,size,capacity,q[];
	QueueADT() {
		front=rear=-1;
		size=0;capacity=7;
	}
	QueueADT(int c){
		front=rear=-1;
		size=0; capacity=c;
		q = new int[c];
	}
	public void enqueue(int x) {
		if(size==capacity) System.out.println("\n Queue Full!");
		else if(rear==-1) front=rear=0;
		else if(rear+1==capacity) rear = 0;
		else rear++;
		q[rear]=x;  size++;
	}
	public void dequeue() {
		int x;
		if(size==0) System.out.println("\n Empty Queue!");
		else {  
			x = q[front]; q[front] = 0;
			if(front+1==capacity) front=0;
			else front++;  size--;
			System.out.println(" Element dequeued : "+x);
		}
	}
	public void displayQueue() {
		int i=front;
		if(size==0) {
			System.out.println("\n Empty Queue!");
			return;
		}
		System.out.println("\n Queue Status : (front to rear)");
		while(i!=rear) {
			if(i==capacity) i=0;
			System.out.print(" "+q[i]);
			i++;
		}	System.out.print(" "+q[i]);
	}
	public void queueMenu() {
		char ch='y';
		Scanner ip = new Scanner(System.in);
		int x,opt;
		System.out.println("\n MENU\n ====");
		System.out.println("\n 1. Enqueue\n 2. Dequeue\n 3. Display Queue");
		while(ch=='y'||ch=='Y') {
			System.out.print("\n Enter choice : ");
			opt = ip.nextInt();
			switch(opt) {
				case 1: System.out.print(" Enter element to enqueue : ");
						x = ip.nextInt();
						enqueue(x); break;
				case 2: dequeue(); break;
				case 3: displayQueue(); break;
				default: break;
			}
			System.out.print("\n Try Again?(Y/N) : ");
			ch = ip.next().charAt(0);
		}
		ip.close();
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		int cap;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter maximum capacity of queue : ");
		cap = ip.nextInt();
		QueueADT queue = new QueueADT(cap);
		queue.queueMenu();
		ip.close();
	}

}
