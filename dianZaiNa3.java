package javaClassWork2;

import java.util.Scanner;
public class dianZaiNa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("������һ��������꣺");
Scanner input = new Scanner(System.in);
double x = input.nextDouble();
double y = input.nextDouble();
if(x>=0&&x<=200&&y>=0&&y<=100-0.5*x) {
	System.out.println("���������������");
}
else {
	System.out.println("����㲻����������");
}
	}

}
