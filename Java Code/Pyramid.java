import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of pyramid: ");
        int a = scanner.nextInt();

        for(int p=1; p<=a; p++){
            for(int q = a; q>p; q--){
                System.out.print(" ");
            }
        for(int r=1; r <= (2* p-1); r++ )
            System.out.print("*");
        
            System.out.println();
        }
    }
}
