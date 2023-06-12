package com.IET.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		FileInputStream fin=null;
		FileOutputStream fout=null;
		
		try {
			fin=new FileInputStream("file.txt");
			System.out.println("Ravi");
			fout=new FileOutputStream("filecopy.txt",true);
	
//				int i=fin.read();
//				 while(i!=-1) {
//					 fout.write(i);
//					 //System.out.println(i);
//					 i=fin.read();
//				 }
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//close the file
			 fin.close();
			 fout.close();
			}catch(IOException e) {
			  System.out.println("error occured");
			}
	}

	}
}
