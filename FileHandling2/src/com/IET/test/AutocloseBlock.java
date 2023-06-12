package com.IET.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class AutocloseBlock {

	
	public static void main(String[] args) {
		try (FileInputStream fin=new FileInputStream("file.txt");
				FileOutputStream fout=new FileOutputStream("file.txt")){
			    int i=fin.read();
			    while(i!=-1) {
					fout.write(i);
					i=fin.read();
				}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
