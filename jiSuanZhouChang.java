package javaClassWork2;

import java.util.Scanner;

public class jiSuanZhouChang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("�����������ε������ߣ�");
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
int C = a+b+c;
if(2*a>=C||2*b>=C||2*c>=C) {
	System.out.println("�������ݲ��Ϸ�");
}
else {
	System.out.println("�������ε��ܳ�Ϊ��" + C);
}
	}

}
