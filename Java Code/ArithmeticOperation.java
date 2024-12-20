import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The operation:");
        System.out.println("1. Sum");
        System.out.println("2. Minus");
        System.out.println("3. Multiply");

        int operation = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOp = true;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            default:
                validOp = false;
                System.out.println("Invalid Selection!");
        }

        if (validOp) {
            System.out.println("Result = " + result);
        }

        scanner.close();
    }
}
