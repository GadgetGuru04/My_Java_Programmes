  public class ThreadCreation {

    static class MyThread extends Thread {
        public void run() {
            System.out.println("Extended Thread class.");
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Runnable interface.");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.start();

        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable class.");
            }
        });
        thread3.start();

       }
}

