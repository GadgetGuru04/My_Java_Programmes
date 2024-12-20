import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String abc = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String xyz = scanner.nextLine();

        System.out.println("The first string is: "+abc);
        System.out.println("The first string is: "+xyz);
    }
}
