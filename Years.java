package bao;

import java.util.Scanner;

public class Years {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入年份");
		int years =sc.nextInt();
	
		if (years%400==0){
			System.out.println(years+" 是闰年");
		}else{
			System.out.println("不是闰年");
		}

	}

}
