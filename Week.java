package bao;

import java.util.Scanner;

public class Week {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入1-7之间的整数");
	int i ;
	   i=sc.nextInt();
         if(i<=5){
        	 System.out.println("今天是工作日");
         }
         if(i>=6&&i<=7){
        	 System.out.println("今天是周末");
         }

	}

}
