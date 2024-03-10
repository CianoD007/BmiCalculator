import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for height and weight
        System.out.println("Enter your height (in meters): ");
        float height = scanner.nextFloat();

        System.out.println("Enter your weight (in kilograms): ");
        float weight = scanner.nextFloat();

        // Calculate BMI
        float bmi = weight / (height * height);


        // Determine the BMI range and display the appropriate message
        if (bmi < 16.00) {
            System.out.println("Your BMI is " + bmi + " - starvation");
        } else if (bmi >= 16.00 && bmi <= 16.99) {
            System.out.println("Your BMI is " + bmi + " - emaciation");
        } else if (bmi >= 17.00 && bmi <= 18.49) {
            System.out.println("Your BMI is " + bmi + " - underweight");
        } else if (bmi >= 18.50 && bmi <= 22.99) {
            System.out.println("Your BMI is " + bmi + " - normal, low range");
        } else if (bmi >= 23.00 && bmi <= 24.99) {
            System.out.println("Your BMI is " + bmi + " - normal, high range");
        } else if (bmi >= 25.00 && bmi <= 27.49) {
            System.out.println("Your BMI is " + bmi + " - overweight, low range");
        } else if (bmi >= 27.50 && bmi <= 29.99) {
            System.out.println("Your BMI is " + bmi + " - overweight, high range");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Your BMI is " + bmi + " - 1st degree obesity");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Your BMI is " + bmi + " - 2nd degree obesity");
        } else {
            System.out.println("Your BMI is " + bmi + " - 3rd degree obesity");
        }

        scanner.close();

    }
}