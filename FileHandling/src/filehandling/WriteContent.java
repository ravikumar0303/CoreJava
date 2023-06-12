package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteContent {
	public static void main(String[] args) {

		FileWriter text;
		try {
			text = new FileWriter("raviFile.text");
			text.write("Hello ");
			text.write("\nwelcome \2");
			text.write("\nTo");
			text.write("\nIET Acts pune");
			text.write("\nGood bye!");
			text.close();

		} catch (IOException er) {
			// TODO Auto-generated catch block
			er.printStackTrace();
		}
		System.out.println("Hello this is file Handling");

		
		 
	}
}
