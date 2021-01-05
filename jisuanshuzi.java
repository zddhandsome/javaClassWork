package javaClassWork3;

import java.util.Scanner;

public class jisuanshuzi {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    int[] counts = new int[101];
    for(int i = 0;i<101;i++) {
    	counts[i]=0;
}
    System.out.println("输入1到100之间的整数：");
    while(true){
    	int tmp = input.nextInt();
    	counts[tmp]++;
    	if(tmp==0)
    		break;
    }
    for(int i=1;i<=100;i++) {
    	if(counts[i]!=0) {
    		if(counts[i]>1) {
    			System.out.println(i+"出现了" +counts[i]+"次");
    		}
    		else System.out.println(i+"出现了"+1+"次");
    	}
    }
	}

}
