import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        while (true) {
            System.out.print("Enter first number (or type 'exit' to quit): ");
            String input1 = scanner.next();

            // if (input1.equalsIgnoreCase("exit")) {
            //     System.out.println("Goodbye!");
            //     break;
            // }

            //System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double number2 = scanner.nextDouble();

            try {
                double number1 = Double.parseDouble(input1);
                double result = calculate(number1, operator, number2);
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number entered. Please try again.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

public static double calculate(double number1, char operator, double number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }
}
