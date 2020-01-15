import java.util.Scanner;

class Bill {
	public String cons_name,type;
	public int cons_no,prev_rd,curr_rd,total_rd;
	public float tariff;

	public float domestic() {
		int i;
		for(i=1;i<=total_rd;i++)
			if(i<=100) tariff+=1;
			else if(i<=200) tariff+=2.50;
			else if(i<=500) tariff+=4;
			else tariff+=6;
		return tariff;
	}
	
	public float commercial() {
		int i;
		for(i=1;i<=total_rd;i++)
			if(i<=100) tariff+=2;
			else if(i<=200) tariff+=4.50;
			else if(i<=500) tariff+=6;
			else tariff+=7;
		return tariff;		
	}
	
	public void theBill() {
		System.out.print("\n\t\t Electricity Bill \n\n");
		System.out.print(" Consumer Number = "+cons_no);
		System.out.print("\n Consumer Name = "+cons_name);
		System.out.print("\n Type of connection = "+type);
		System.out.print("\n Bill Amount = "+tariff);
	} 
}

public class EBbill {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		char ch = 'y';
		Bill obj = new Bill();
		do {
		obj.tariff = 0;
		System.out.print("\n Enter Details =\n\n");
		System.out.print(" Consumer Name = ");
		obj.cons_name = ip.next();
		System.out.print(" Consumer Number = ");
		obj.cons_no = ip.nextInt();
		System.out.print(" Previous month reading = ");
		obj.prev_rd = ip.nextInt();
		System.out.print(" Current month reading = ");
		obj.curr_rd = ip.nextInt();
		System.out.print("\n Connection type = (domestic or commercial) = ");
		obj.type = ip.next();
		obj.type = obj.type.toLowerCase();
		obj.total_rd = obj.prev_rd + obj.curr_rd;
		switch(obj.type) {
		 case "domestic" : obj.tariff = obj.domestic();
		 				   obj.theBill(); break;
		 case "commercial" : obj.tariff = obj.commercial();
		 					 obj.theBill(); break;
		 default: System.out.print("\n Wrong type!!");
		}

		System.out.print("\n\n Continue ? (Y/N) = ");
		ch = ip.next().charAt(0);
		} while(ch=='y' || ch=='Y');
		ip.close();
		System.out.print(" Program Terminated!");

	}

}
