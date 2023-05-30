class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

public class que8 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}