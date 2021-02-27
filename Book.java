package bao;

public class Book {

	String name;
	double Aprice;
	String color;
	
	
	public static void main(String[] args) {
		
		 Book a = new Book();
		 a.name="高等数学";
		 a.Aprice=10.00;
		 a.addAprice(1.00);
		 a.color="bule";
		 		
	}
	
	void addAprice(double price ){
		Aprice=Aprice+price;
		 System.out.println(Aprice);
	}
	 
	

}
