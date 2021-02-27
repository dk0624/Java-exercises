package bao;

public class Yibaiwan {


	public static void main(String[] args) {
		
		//F = p*((1+r)^n);   1+r==R
		float p = 12000;
		float R =1.2f;
		int F = 0;
		int sum = 1000000;
		for(int n =1;n<100;n++){
			p = p *R;			
			F= (int) (p+F);
			if(F>=sum){
				System.out.println("第"+n+"年赚了"+F);
				break;
				
			}
			 
			
		}
		
	}
	}


