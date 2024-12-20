public class arraySort {

    public static String isSorted(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return "isUnsorted";
            }
        }
        return "isSorted";
    }
    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        String result = isSorted(a);
        System.out.println("The array " + result);
    }
}
