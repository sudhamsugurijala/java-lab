import java.io.*;
import java.util.Scanner;

class FileDemo {
	
	static void p(String s) { System.out.println(s); }
	
	public static void main(String args[]) {
		String s;
		Scanner ip = new Scanner(System.in); 
		System.out.print("\n Enter file name : ");	s = ip.next();
		File f1 = new File(s);
		p(" File Name: " + f1.getName());
		p(" "+f1.getName()+(f1.exists() ? " exists" : " does not exist"));
		p(" "+f1.getName()+(f1.canWrite() ? " is writeable" : " is not writeable"));
		p(" "+f1.getName()+(f1.canRead() ? " is readable" : " is not readable"));
		p(" "+f1.getName()+(" is " + (f1.isDirectory() ? "" : "not" + " a directory")));
		p(" "+f1.getName()+(f1.isFile() ? " is normal file" : " might be a named pipe"));
		p(" File size: " + f1.length() + " Bytes");
		}
	}
