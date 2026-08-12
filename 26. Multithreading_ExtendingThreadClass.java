//Multithreading enables a Java program to run multiple threads simultaneously, allowing tasks to execute in parallel

class myThreadOne extends Thread {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread One "+i);
        }
    }
}

class myThreadTwo extends Thread {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread Two "+i);
        }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        myThreadOne t1 = new myThreadOne();
        t1.start();
        myThreadTwo t2 = new myThreadTwo();
        t2.start();
    }
}
