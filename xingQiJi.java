package javaClassWork2;

import java.util.Scanner;
public class xingQiJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
Scanner input = new Scanner(System.in);
System.out.println("������ݣ�");
int year = input.nextInt();
System.out.println("�����·ݣ�");
int month = input.nextInt();
if(year%400==0||year%4==0&&year%100!=0) {
	mdays[1] = 29;
}
System.out.println("������µĵڶ����죺");
int q = input.nextInt();
if(month==1||month==2) {
	month+=12;
	year--;
}
int h = (q+26*(month+1)/10+year%100+year%100/4+year/100/4+5*(year/100))%7;
String[]days = {"������","������","����һ","���ڶ�","������","������","������"};
System.out.println("�����ǣ�"+days[h]);

}
	}
