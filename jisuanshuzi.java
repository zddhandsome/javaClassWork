package javaClassWork3;

import java.util.Scanner;

public class jisuanshuzi {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    int[] counts = new int[101];
    for(int i = 0;i<101;i++) {
    	counts[i]=0;
}
    System.out.println("����1��100֮���������");
    while(true){
    	int tmp = input.nextInt();
    	counts[tmp]++;
    	if(tmp==0)
    		break;
    }
    for(int i=1;i<=100;i++) {
    	if(counts[i]!=0) {
    		if(counts[i]>1) {
    			System.out.println(i+"������" +counts[i]+"��");
    		}
    		else System.out.println(i+"������"+1+"��");
    	}
    }
	}

}
