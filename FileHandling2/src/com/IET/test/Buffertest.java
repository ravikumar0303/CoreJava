package com.IET.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Buffertest {
	
	public static void main(String[] args) {
		try(BufferedInputStream bin=new BufferedInputStream(new FileInputStream("file.txt"));
				BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("file.txt"))){
			
			int r=bin.read();
			while(r!=-1) {
				bout.write(r);
				r=bin.read();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
