public class Top10PrimeNum {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 2; count < 10; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }
        }
    }
}
