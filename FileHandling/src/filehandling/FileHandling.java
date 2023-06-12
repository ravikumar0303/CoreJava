package filehandling;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println(System.getProperty("user.dir"));
		File myfile=new File("raviFile.text");
		try {
			DataOutputStream oos = new DataOutputStream(new FileOutputStream(myfile));
			DataInputStream ois = new DataInputStream(new FileInputStream(myfile));
			String s = sc.next();
			while(!s.equals("exit")) {
				oos.writeUTF(s);
				s = sc.next();
			}
			s = ois.readUTF();
			while(s!=null) {
				System.out.println(s);
				s = ois.readUTF();
			}
		}
		catch(EOFException e) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
