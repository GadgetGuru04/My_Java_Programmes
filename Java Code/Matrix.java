import java.util.Scanner;

public class Matrix {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] mat1 = new int [rows][cols];
        int[][] mat2 = new int [rows][cols];
        int[][] mat3 = new int[rows][cols];

        System.out.println("Enter 1st matrix:");
        for (int a=0; a<rows; a++){
            for (int b=0; b<cols; b++){
                System.out.print("Enter the element of the position ["+(a+1)+"]["+(b+1)+"]: ");
                mat1[a][b] = scanner.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix:");
        for (int a=0; a<rows; a++){
            for (int b=0; b<cols; b++){
                System.out.print("Enter the element of the position ["+(a+1)+"]["+(b+1)+"]: ");
                mat2[a][b] = scanner.nextInt();
            }
        }

        System.out.println("Enter 3rd matrix:");
        for (int a=0; a<rows; a++){
            for (int b=0; b<cols; b++){
                System.out.print("Enter the element of the position ["+(a+1)+"]["+(b+1)+"]: ");
                mat3[a][b] = scanner.nextInt();
            }
        }

        System.out.println("Sum of the given three matrices is:");
        for (int a=0; a<rows; a++){
            for (int b=0; b<cols; b++){
                System.out.print((mat1[a][b] + mat2[a][b] + mat3[a][b]) + " ");
            }
            System.out.println();
        }
    }
}