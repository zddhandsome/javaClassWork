package javaClassWork2;

import java.util.Scanner;
public class twoJuXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
System.out.println("请输入第一个矩形的中心点坐标以及它的长和宽：");
double x1 = input.nextDouble();
double y1 = input.nextDouble();
double w1 = input.nextDouble();
double h1 = input.nextDouble();
System.out.println("请输入第二个矩形的中心点坐标以及它的长和宽：");
double x2 = input.nextDouble();
double y2 = input.nextDouble();
double w2 = input.nextDouble();
double h2 = input.nextDouble();
if((x1+w1/2>=x2+w2/2)&&(x1-w1/2<=x2-w2/2)&&(y1+h1/2>=y2+h2/2)&&(y1-h1/2<=y2-h2/2))
    System.out.println("第二个矩形在第一个矩形中");
else if((x2-w2/2>x1+w1/2)||(x2+w2/2<x1-w1/2)||(y2-h2/2>y1+h1/2)||(y2+h2/2<y1-h1/2))
    System.out.println("两个矩形不重叠");
else if((x2+w2/2>=x1+w1/2)&&(x2-w2/2<=x1-w1/2)&&(y2+h2/2>=y1+h1/2)&&(y2-h2/2<=y1-h1/2))
    System.out.println("第一个矩形在第二个矩形中");
else
    System.out.println("两个矩形重叠");
	}

}
