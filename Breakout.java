package bao;

public class Breakout {
	        public static void main (String[]ages){
	        	
	        	
	     boolean breakout = false; //是否终止外部循环的标记
             for (int i = 1; i < 10; i++) {

         for (int j = 1; j < 10; j++) {
             System.out.println(i + ":" + j);
             if (0 == j %5 ) {
                 breakout = true; //终止外部循环的标记设置为true
                 break;
             }
         }
         if (breakout) //判断是否终止外部循环
             break;
     }
	}
}
