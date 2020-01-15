
// import all necessary files (The one Package Having everything).
import java.io.*;

class HMS implements Runnable {

	protected File f1 = new File(""); // put file name!
	protected File f2 = new File(""); // put file name!
	
	public HMS() {
		Thread T = new Thread("Demo");
		T.start();
	}
	
	public void run() {  // THE PLACE WHERE EVERYTHING STARTS
		
		FileIO fio = new FileIO();  // if FileIO in differnt package,IMPORT that FIRST
		
		/* Use this object 'fio' for all file writing reading operations.
		 * 
		 * For example to write an object Doctor to a file "DoctorDB.txt" do
		 * 
		 * fio.writeToFile(Doctor,"DoctorDB.txt");
		 * 
		 * for reading do
		 * 
		 * fio.readFromFile(Record,"filename.txt")*/
		
	}
	
}

public class HMSDemo {
	public static void main(String[] args) {
		new HMS();
	}
}
