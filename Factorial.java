package bao;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a =sc.nextInt();
		int i =1;
		while(a>1){
			i = a * i;
			a--;			
		}
		System.out.println(i);
		}

	}


