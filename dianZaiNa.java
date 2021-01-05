package javaClassWork2;


import java.util.Scanner;
public class dianZaiNa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("请输入一个点的坐标");
Scanner input = new Scanner(System.in);
double x = input.nextDouble();
double y = input.nextDouble();

if(x*x+y*y>100) {
	System.out.println("这个点不在圆内");
}
else {
	System.out.println("这个点在圆内");
}
	}

}
