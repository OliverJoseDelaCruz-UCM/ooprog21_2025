import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        double interest_rate = 0.02;
        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.print("Enter Initial bank balance > ");
        double init_balance = input.nextDouble();

        int antyr;
        
         for(int i = 0; i < 4; i++){
                System.out.println("\nWith an initial balance of " + init_balance + " at an interest rate of " + String.format ("%.2f" ,interest_rate));
                double balance = init_balance;
                
                for(int z = 0;z < 4; z++){
                balance += balance * interest_rate;
                System.out.println("After year " + (1 + z) + " balance is $" + balance);
                }
               interest_rate += 0.01;
            }
          break;  
    }
}

}
