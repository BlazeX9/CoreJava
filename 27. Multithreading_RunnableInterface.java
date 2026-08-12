class MyThreadOne implements Runnable {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread One i="+i);
        }
    }
}

class MyThreadTwo implements Runnable {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread Two i="+i);
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyThreadOne t1 = new MyThreadOne();
        Thread one = new Thread(t1);
        one.start();
        MyThreadTwo t2 = new MyThreadTwo();
        Thread two = new Thread(t2);
        two.start();
    }
}
