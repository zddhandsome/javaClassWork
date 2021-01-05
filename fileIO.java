package javaClassWork9;

import java.io.*;
import java.io.IOException;

public class fileIO {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 File myFile  = new File("zddjavatest.txt");
 File yourFile  = new File("jqyjavatest.txt");
 PrintWriter output = new PrintWriter(myFile);
 
	
 output.println("11111");
 output.println("zdd");
 
FileReader in = new FileReader(myFile);
FileWriter out = new FileWriter(yourFile);

 char[] bytes = new char[1024];
 int len = -1;
 while((len=in.read(bytes))!=-1) {
	 out.write(bytes,0,len);
 }
 
 output.close();
	}

}
