import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        final double interest_rate = 0.03;
        int year = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Initial bank balance > ");
        double init_balance = input.nextDouble();

        int antyr;

        do {
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n    or any other number for no >> ");
            antyr = input.nextInt();

            if (antyr == 1) {
                init_balance += init_balance * interest_rate;
                System.out.println("After year " + year + " at 0.03 interest rate, balance is $ " + init_balance);
                year++;
            }

        } while (antyr == 1);

        System.out.println("");
    }
}
