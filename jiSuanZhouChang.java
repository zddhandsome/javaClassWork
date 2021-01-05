package javaClassWork2;

import java.util.Scanner;

public class jiSuanZhouChang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("请输入三角形的三条边：");
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
int C = a+b+c;
if(2*a>=C||2*b>=C||2*c>=C) {
	System.out.println("输入数据不合法");
}
else {
	System.out.println("该三角形的周长为：" + C);
}
	}

}
