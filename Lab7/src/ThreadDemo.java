import java.util.*;

class ThreadOne implements Runnable{
		public void run() {
			Random rand = new Random();
			Scanner ip = new Scanner(System.in);
			try{
				int i,c,n;
				System.out.print("\n Enter Number of cycles : ");
				n = ip.nextInt();
				for(c=0;c<n;c++) {
						i = rand.nextInt(21);
						System.out.println("\n Generated Number : "+i);
						if(i%2==0) {
							System.out.println(" "+i+" is Even");
							Thread t = new Thread(new ThreadTwo(i));
							t.start();
						}
						else {
							System.out.println(" "+i+" is Odd");
							Thread t = new Thread(new ThreadThree(i));
							t.start();
						}
						Thread.sleep(1000);
				}
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		public void start(){ run(); }
}

class ThreadTwo implements Runnable{
	
	public int i;
	public ThreadTwo(int i) { this.i = i*i; }
	public void run() {
		System.out.println(" Square Value : "+i);
	}
}

class ThreadThree implements Runnable{
	public int i;
	public ThreadThree(int i) { this.i = i*i*i; }
	public void run() {
		System.out.println(" Cube Value : "+i);
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadOne obj = new ThreadOne();
		obj.start();
	}
}