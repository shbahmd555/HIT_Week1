package com.sas2;
import java.io.*;

public class MineFile {
	public static void main(String argv[]){
		MineFile m=new MineFile();
	System.out.println(m.amethod());
	}
	public int amethod() {
	try {
	FileInputStream dis=new FileInputStream("Hello.txt");
	}catch (FileNotFoundException fne) {
	System.out.println("No such file found");
	return -1;
	}catch(IOException ioe) {
	} finally{
	System.out.println("Doing finally");
	}
	return 0;
	}
	

}
