package bao;

import java.util.Scanner;

public class Weught {                 //类名
	
           
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);                     //方法
		System.out.println("请输入您的身高/m");
		float height;
	    height=sc.nextFloat();
	    System.out.println("您输入的身高为："+height); 
	    
	    System.out.println("请输入您的体重/kg");
	    float weught;
	    weught=sc.nextFloat();
	    System.out.println("您输入的体重为"+weught);
	    
	    float BMI;
	    BMI=weught/ (height*height) ;
	    System.out.println("您的BMI为:"+BMI);
	    
	    if (BMI<18.5){
	    	System.out.println("体重过轻");
	    }
	    else if(18.5<= BMI&BMI <24){
	    	System.out.println("体重正常");	    	
	    }
	    else if(24<=BMI&BMI<27){
	    	System.out.println("体重过重");	
	    }
	    else if(27<=BMI&BMI<30){
	    	System.out.println("轻度肥胖");	
	    }
	    else if(30<=BMI&BMI<35){
	    	System.out.println("中度肥胖");	
	    }else if(35<=BMI){
	    	System.out.println("重度肥胖");	
	    }

	}

}
