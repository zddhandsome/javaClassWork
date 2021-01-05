package javaClassWork9;

import java.io.IOException;
import java.io.*;
public class fileOutPut {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
   File myFile = new File("zdd.txt");
   if(!myFile.exists()) {
		myFile.createNewFile();
		System.out.println("创建文件成功");
	}
	}

}
