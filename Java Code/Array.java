
public class array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        display(a);
    }

    public static void display(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}