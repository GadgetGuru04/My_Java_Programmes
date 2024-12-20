import java.util.Scanner;

public class NameValidation {
    public static boolean isValidName(String name) {
        for (char ch : name.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if (isValidName(name)) {
            System.out.println("You entered a valid name.");
        } else {
            System.out.println("Not a valid name.");
        }

        scanner.close();
    }
}
