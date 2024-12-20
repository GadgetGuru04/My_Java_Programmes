class Circle {
    int radius = 0;
}

public class CircleThread {
    public static void main(String[] args) {
        Circle objectCircle = new Circle();

        Thread thread1 = new Thread(() -> {
            objectCircle.radius = 5;
            System.out.println("Thread 1: Radius initialized to " + objectCircle.radius);
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted.");
            }
            System.out.println("Thread 2: Radius value is " + objectCircle.radius);
        });

        thread1.start();
        thread2.start();
    }
}
