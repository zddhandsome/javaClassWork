package javaClassWork2;

import java.util.Scanner;
public class twoJuXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);
System.out.println("�������һ�����ε����ĵ������Լ����ĳ��Ϳ�");
double x1 = input.nextDouble();
double y1 = input.nextDouble();
double w1 = input.nextDouble();
double h1 = input.nextDouble();
System.out.println("������ڶ������ε����ĵ������Լ����ĳ��Ϳ�");
double x2 = input.nextDouble();
double y2 = input.nextDouble();
double w2 = input.nextDouble();
double h2 = input.nextDouble();
if((x1+w1/2>=x2+w2/2)&&(x1-w1/2<=x2-w2/2)&&(y1+h1/2>=y2+h2/2)&&(y1-h1/2<=y2-h2/2))
    System.out.println("�ڶ��������ڵ�һ��������");
else if((x2-w2/2>x1+w1/2)||(x2+w2/2<x1-w1/2)||(y2-h2/2>y1+h1/2)||(y2+h2/2<y1-h1/2))
    System.out.println("�������β��ص�");
else if((x2+w2/2>=x1+w1/2)&&(x2-w2/2<=x1-w1/2)&&(y2+h2/2>=y1+h1/2)&&(y2-h2/2<=y1-h1/2))
    System.out.println("��һ�������ڵڶ���������");
else
    System.out.println("���������ص�");
	}

}
