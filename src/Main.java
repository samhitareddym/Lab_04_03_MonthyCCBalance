import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the initial credit card balance
        System.out.print("Enter the initial credit card balance: $");
        double balance = scanner.nextDouble();

        // Annual interest rate
        double annualInterestRate = 0.17; // 17%
        // Monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate interest for the first month
        double interestMonth1 = balance * monthlyInterestRate;
        // Calculate total balance after the first month
        double balanceAfterMonth1 = balance + interestMonth1;

        // Calculate interest for the second month
        double interestMonth2 = balanceAfterMonth1 * monthlyInterestRate;

        // Display the results
        System.out.println("Interest Due After 1 Month: $" + interestMonth1);
        System.out.println("Interest Due After 2 Months: $" + interestMonth2);

        // Close the scanner
        scanner.close();
    }
}