package javaClassWork2;


import java.util.Scanner;
public class dianZaiNa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("请输入一个点的坐标：");
Scanner input = new Scanner(System.in);
double x = input.nextDouble();
double y = input.nextDouble();
if(x<=10/2&&x>=-10&&y<=5.0/2&&y>=-5.0/2) {
	System.out.println("这个点在矩形内");
}
else {
	System.out.println("这个点在不在矩形内");
}
	}

}
