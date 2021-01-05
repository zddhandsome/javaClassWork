package javaClassWork2;

import java.util.Scanner;
public class twoCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("请输入第一个圆的坐标和半径：");
double x1 = input.nextDouble();
double y1 = input.nextDouble();
double r1 = input.nextDouble();
System.out.println("请输入第二个圆的坐标和半径：");
double x2 = input.nextDouble();
double y2 = input.nextDouble();
double r2 = input.nextDouble();
if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=Math.abs(r1-r2))
    System.out.println("第二个圆包含在第一个圆中");
else if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=r1+r2)
    System.out.println("两个圆重叠");
else
    System.out.println("两个圆不重叠");
	}

}
