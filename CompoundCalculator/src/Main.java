import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal, rate, amount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest grade (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("\nThe amount after %d is: $ %.2f", years, amount);

        scanner.close();
    }
}
