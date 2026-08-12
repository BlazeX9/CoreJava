class myThreadThree implements Runnable {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread One i="+i);
        }
    }
}

class myThreadFour implements Runnable {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Thread Two i="+i);
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        myThreadThree t1 = new myThreadThree();
        Thread one = new Thread(t1);
        myThreadFour t2 = new myThreadFour();
        Thread two = new Thread(t2);
        one.start();
        two.start();
    }
}
