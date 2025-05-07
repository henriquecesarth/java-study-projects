import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // WEIGHT CONVERTION PROGRAM

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        int convertionType;

        // Welcome message
        System.out.println("WEIGHT CONVERTION PROGRAM");

        // Prompt for user choice
        System.out.print("Choose the type of conversion (1- lbs -> kgs; 2- kgs -> lbs): ");
        convertionType = scanner.nextInt();

        // Option 1 convert lbs to kgs
        if (convertionType == 1){
            System.out.print("Enter the amount of weight in lbs: ");
            weight = scanner.nextDouble();
            weight *= 0.45;
            System.out.println("Your weight in kgs is " + weight + " kgs");
        }
        // Option 2 convert kgs to lbs
        else if (convertionType == 2){
            System.out.print("Enter the amount of weight in kgs: ");
            weight = scanner.nextDouble();
            weight *= 2.2;
            System.out.println("Your weight in lbs is " + weight + " lbs");
        }
        // else print not a valid choice
        else {
            System.out.println("Not a valid choice of convertion!");
        }
    }
}
