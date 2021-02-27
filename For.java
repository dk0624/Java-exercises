package bao;

import java.util.Scanner;

public class For {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第几天");
		int moneyEachDay = 0;
		int day = sc.nextInt(); 
		int sum = 0;
		
		for(int i = 1;i <=day;i++){
			if(i==1){
				moneyEachDay= 1 ;
			}
			else{
				moneyEachDay =moneyEachDay * 2 ;
			}
			sum = moneyEachDay + sum;
			System.out.println(i+"天后获得"+sum+"块钱");
		}
           
	}

}
