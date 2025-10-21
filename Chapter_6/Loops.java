import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		final double interest_rate = 0.03;
      int year = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Initial bank balance > ");
		double init_balance = input.nextDouble();
      while(true){
		System.out.println("Do you want to see next year's balance?");
		System.out.print("Enter 1 for yes or any other number for no >> ");
      int antyr = input.nextInt();
				if (antyr == 1){
                  
						init_balance += init_balance * interest_rate;
						System.out.println("After year at 0.03 interest rate, balance is $ " + init_balance);					
						
					}else{
						break;  }  
		}			
	}
}