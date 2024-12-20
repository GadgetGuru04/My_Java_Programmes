public class sumNonNegative {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            int number = Integer.parseInt(arg);

            if (number >= 0) {
                sum += number;
            }
        }

        System.out.println("sum: " + sum);
    }
}
