package javaClassWork2;

import java.util.Scanner;
public class dianZaiNa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("请输入一个点的坐标：");
Scanner input = new Scanner(System.in);
double x = input.nextDouble();
double y = input.nextDouble();
if(x>=0&&x<=200&&y>=0&&y<=100-0.5*x) {
	System.out.println("这个点在三角形内");
}
else {
	System.out.println("这个点不在三角形内");
}
	}

}
