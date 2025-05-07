import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp, newTemp;
        String scale;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        scale = scanner.next().toUpperCase();

        newTemp = scale.equals("C") ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("The converted temperature: %.1fº%s", newTemp, scale);

        scanner.close();
    }
}
