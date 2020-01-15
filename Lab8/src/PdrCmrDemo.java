import java.util.Random;

class Q {
int n;
boolean value=false;
synchronized int get() {
	while(!value)
		try	{
		wait();
		} catch(InterruptedException e){
			System.out.println("InterruptedException caught");
		}
	value=false;
	System.out.println("Got "+n);
	if(n%5==0) {
		try {
			Thread.sleep(2000);
			System.out.println(" Consumer Waiting...");
		} catch(InterruptedException e){
			System.out.println("Error");
		}
	}
	notify();
	return n;
}

synchronized void put(int n) {
	while(value)
		try	{
			wait();
		}catch(InterruptedException e){
			System.out.println("InterruptedException caught");
		}
	this.n = n;
	value=true;
	System.out.println("Put: " + n);
	if(n%4==0)	{
		try {
			Thread.sleep(2000);
			System.out.println(" Producer Waiting...");
		} catch(InterruptedException e){
			System.out.println("Error");
		}
	}
	notify();
}
}

class Producer implements Runnable {
	Random r=new Random();
	Q q;
	Thread t;
	Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	public void run() {
	int i;
	try
	{	while(true) 
		{
			t.sleep(1000);
			i=r.nextInt(20)+1;
			q.put(i);
		}
	}	catch(InterruptedException e){
		System.out.println("error");
	}
	}
}
class Consumer implements Runnable {
	Q q;
	Thread t;
	Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
}
	public void run() {
	try
	{	while(true) 
		{
			t.sleep(1000);
			q.get();
		}
	} catch(InterruptedException e){
			System.out.println("error");
		}
	}
}

public class PdrCmrDemo {
	public static void main(String args[]) 
	{
		System.out.println("Press Control+C to quit program.");
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
