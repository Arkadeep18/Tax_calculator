import java.util.*;
public class Tax_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the income of the employee");
		double income = sc.nextDouble();
		
		double tax = 0;
		
		if(income <= 2.5) {
			tax = 0;
		}
		else if(income>2.5 && income<=5.0) {
			tax =0.05*(income-2.5);
		}
		else if(income>5.0 && income<=10.0) {
			tax = 0.05*(5.0 - 2.5)+ 0.2*(income-5.0);
		}
		else if(income>10.0) {
			
			
			tax = 0.05*(5.0 - 2.5) +0.2 *(10.0 - 5.0)+ 0.3*(income-10.0);
		}
		System.out.println("Tax: "+tax);
		
	}

}
