package javaClassWork2;

import java.util.Scanner;

public class caiPiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int caiPiao = (int)(Math.random()*1000);

int caiPiaoDigit1 = caiPiao / 100;
int caiPiaoDigit2 = caiPiao / 10 % 10;
int caiPiaoDigit3 = caiPiao % 10 % 10;
Scanner input = new Scanner (System.in);
System.out.println("������Ĳ�Ʊ���룺");
int yongHu = input.nextInt();

int yongHuDigit1 = yongHu / 100;
int yongHuDigit2 = yongHu / 10 % 10;
int yongHuDigit3 = yongHu % 10 % 10;

System.out.println("�н�����Ϊ�� "+caiPiao);

if(caiPiao==yongHu) {
	System.out.println("������10000����");
}
if((yongHuDigit1==caiPiaoDigit1&&yongHuDigit2==caiPiaoDigit3&&yongHuDigit3==caiPiaoDigit2)||(yongHuDigit1==caiPiaoDigit2&&yongHuDigit2==caiPiaoDigit1&&yongHuDigit3==caiPiaoDigit3)||(yongHuDigit1==caiPiaoDigit2&&yongHuDigit2==caiPiaoDigit3&&yongHuDigit3==caiPiaoDigit1)||(yongHuDigit1==caiPiaoDigit3&&yongHuDigit2==caiPiaoDigit1&&yongHuDigit3==caiPiaoDigit2)||(yongHuDigit1==caiPiaoDigit3&&yongHuDigit2==caiPiaoDigit2&&yongHuDigit3==caiPiaoDigit1)) {
	System.out.println("������3000����");
}
else if(yongHuDigit1==caiPiaoDigit1||yongHuDigit1==caiPiaoDigit2||yongHuDigit1==caiPiaoDigit3||yongHuDigit2==caiPiaoDigit1||yongHuDigit2==caiPiaoDigit2||yongHuDigit2==caiPiaoDigit3||yongHuDigit3==caiPiaoDigit1||yongHuDigit3==caiPiaoDigit2||yongHuDigit3==caiPiaoDigit3) {
	System.out.println("������1000����");
}
else {
	System.out.println("��û�н�");
}
	}
}