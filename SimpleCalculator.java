import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        scanner.close();
    }
}
