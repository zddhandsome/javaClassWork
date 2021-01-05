package javaClassWork2;

import java.util.Scanner;
public class xingQiJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
Scanner input = new Scanner(System.in);
System.out.println("输入年份：");
int year = input.nextInt();
System.out.println("输入月份：");
int month = input.nextInt();
if(year%400==0||year%4==0&&year%100!=0) {
	mdays[1] = 29;
}
System.out.println("输入该月的第多少天：");
int q = input.nextInt();
if(month==1||month==2) {
	month+=12;
	year--;
}
int h = (q+26*(month+1)/10+year%100+year%100/4+year/100/4+5*(year/100))%7;
String[]days = {"星期六","星期天","星期一","星期二","星期三","星期四","星期五"};
System.out.println("这天是："+days[h]);

}
	}
