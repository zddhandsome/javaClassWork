package javaClassWork3;

import java.util.Scanner;
public class paiXu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈë10¸öÊı£º");
		Scanner input = new Scanner(System.in);
		double[] ass = new double[100];
		for (int i=0;i<10;i++) {
			ass[i] = input.nextDouble();
		}
		sort(ass);
		for(int i = 0;i<10;i++) {
			System.out.println(ass[i]);
		}
}
	  public static void sort(double[] ass)
	    {
	        for(int i=ass.length-1;i>=2;i--)
	        {
	            for(int j=0;j<i;j++)
	            {
	                if(ass[j]>ass[j+1])
	                {
	                    double tmp = ass[j];
	                    ass[j] = ass[j+1];
	                    ass[j+1]=tmp;
	                }
	            }
	        }	    
}
}
