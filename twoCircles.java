package javaClassWork2;

import java.util.Scanner;
public class twoCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("�������һ��Բ������Ͱ뾶��");
double x1 = input.nextDouble();
double y1 = input.nextDouble();
double r1 = input.nextDouble();
System.out.println("������ڶ���Բ������Ͱ뾶��");
double x2 = input.nextDouble();
double y2 = input.nextDouble();
double r2 = input.nextDouble();
if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=Math.abs(r1-r2))
    System.out.println("�ڶ���Բ�����ڵ�һ��Բ��");
else if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=r1+r2)
    System.out.println("����Բ�ص�");
else
    System.out.println("����Բ���ص�");
	}

}
