import java.util.Scanner;

class MaxValGen<T> {
	public static <T extends Comparable<T>> void MaxVal(T arr[]) {
		T max= arr[0]; int i;
		for(i=1;i<arr.length;i++) {
			if(arr[i].compareTo(max)>0) max = arr[i];
		}
		System.out.println(" Maximum Value : "+max);
	}
}
public class MaxValGenDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter size of arrays : ");
		int i,n = ip.nextInt();
		Integer[] arr1 = new Integer[n];
		Double[] arr2 = new Double[n];
		String[] arr3 = new String[n];
		
		System.out.print("\n Enter values of Integer array : ");
		for(i=0;i<n;i++) arr1[i] = ip.nextInt();
		MaxValGen.MaxVal(arr1);
		System.out.print(" Enter values of Double array : ");
		for(i=0;i<n;i++) arr2[i] = ip.nextDouble();
		MaxValGen.MaxVal(arr2);
		System.out.print(" Enter values of String array : ");
		for(i=0;i<n;i++) arr3[i] = ip.next();
		MaxValGen.MaxVal(arr3);
		ip.close();
	}

}
