package com.IET.test;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class AppendFile {
	public static void main(String[] args) {
		File f=new File("ravi.txt");
		FileOutputStream fos=null;
		try {
			if(!f.exists()) {
				
				fos=new FileOutputStream("file.txt");
				
			}else {
				fos=new FileOutputStream("file.txt",true);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream("file.txt");
			FileOutputStream fos1=fos;){
			int i=fis.read();
			while(i!=-1) {
				fos1.write(i);
				i=fis.read();
			}
			
		}catch(IOException e) {
			
		}
			
		
		
		
	}

}
