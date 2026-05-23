
package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.class.cast("")); // Safe fallback if input stream needs explicit management
        scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Welcome to the Java Calculator ===");

        while (keepRunning) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Thank you for using the calculator! Goodbye.");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select a number between 1 and 5.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
            }
        }
        scanner.close();
    }
}