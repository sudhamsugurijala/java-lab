import java.util.Scanner;

class Search {
	public int linearSearch(int a[],int n,int ele) {
		int i;
		for(i=0;i<n;i++) {
			if(a[i]==ele) {
				return ++i;
			}
		}
		return -1;
	}
	
	public int binarySearch(int a[],int n,int ele) {
		int mid,beg=0,end=n;
		while(beg<end) {
			mid = (end+beg)/2;
			if(ele==a[mid]) return ++mid;
			else if(ele<a[mid]) end = mid-1;
			else beg = mid+1;
		}
		return -1;
	}
}

public class SearchingDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		char ch = 'y';
		int opt,p=-1,n,ele,i,j,temp;
		Search obj = new Search();
		System.out.print("\n Enter number of elements = ");
		n = ip.nextInt();
		int[] a = new int[n];
		System.out.print(" Enter elements = ");
		for(i=0;i<n;i++)
			a[i] = ip.nextInt();
		for(i=0;i<n-1;i++)
			for(j=0;j<n-i-1;j++)
				if(a[j]>a[j+1]) {
						temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
			}
		System.out.print("\n Sorted Array = ");
		for(i=0;i<n;i++) System.out.print(a[i]+" ");
		while(ch == 'Y' || ch == 'y') {
			System.out.println("\n Searching Techniques");
			System.out.print("\n 1. Linear Search \n 2. Binary Search");
			System.out.print("\n Enter option = ");
			opt = ip.nextInt();
			switch(opt) {
			case 1:
				System.out.print(" Enter an element to search = ");
				ele = ip.nextInt();
				p = obj.linearSearch(a,n,ele);
				if(p==-1) System.out.println("\n Element not found!");
				else System.out.println("\n Element found at position "+p);
				break;
			case 2:
				System.out.print(" Enter an element to search = ");
				ele = ip.nextInt();
				p = obj.binarySearch(a,n,ele);
				if(p==-1) System.out.println("\n Element not found!");
				else System.out.println("\n Element found at position "+p);
				break;
			default: System.out.println("\n Wrong choice!");
			}
			System.out.print("\n Try again ? (Y/N) =  ");
			ch = ip.next().charAt(0);			
		}
		System.out.print("\n Program Terminated!");
		ip.close();
	}
}


