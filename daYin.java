package javaClassWork3;

import java.util.Scanner;
public class daYin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        int[] ass = new int[12];
	        int ptr = 0;
	        System.out.print("请输入十个数: ");
	        for(int i=0;i<10;i++)
	        {
	            int tmp=input.nextInt();
	            boolean in = false;
	            for(int j=0;j<ptr;j++)
	            {
	                if(ass[j]==tmp)
	                {
	                    in=true;
	                    break;
	                }
	            }
	            if(!in)
	            {
	                ass[ptr]=tmp;
	                ptr++;
	            }
	        }
	        System.out.println("互不相同的数的数量为："+ptr);
	        System.out.print("这些互不相同的数分别是: ");
	        for(int i=0;i<ptr;i++)
	            System.out.print(ass[i]+" ");
	}

}
