import java.util.*;
public class Tax_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the income of the employee");
		double income = sc.nextDouble();
		
		double tax = 0;
		//income in lakhs
		if(income <= 2.5) {		//no tax below 2.5 lakhs
			tax = 0;
		}
		else if(income>2.5 && income<=5.0) {	//5% tax on 2.5 - 5 lakh
			tax =0.05*(income-2.5);
		}
		else if(income>5.0 && income<=10.0) {			//5% tax on 2.5 - 5 lakh & 20% tax on 5 - 10 lakh
			tax = 0.05*(5.0 - 2.5)+ 0.2*(income-5.0);
		}
		else if(income>10.0) {						//5% tax on 2.5 - 5 lakh & 20% tax on 5 - 10 lakh & 30% tax on 10/upto 10 lakhs
			tax = 0.05*(5.0 - 2.5) +0.2 *(10.0 - 5.0)+ 0.3*(income-10.0);
		}
		System.out.println("Tax: "+tax);
		
	}

}
