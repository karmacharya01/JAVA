public class ThreadLifeCycle {
    public static void main(String[] args) {
        ThreadLifeCycleClassA t1 = new ThreadLifeCycleClassA();
        ThreadLifeCycleClassB t2 = new ThreadLifeCycleClassB();
        t1.start();
        t2.start();
        try {
            t1.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("Main Thread End");
    }

}

class ThreadLifeCycleClassA extends Thread {
    public void run() {
        System.out.println("This is Thread A.");
        System.out.println("M in Thread A.");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread A is Completed.");
    }
}

class ThreadLifeCycleClassB extends Thread {
    public void run() {
        System.out.println("This is Thread B.");
        System.out.println("M in Thread B.");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("Thread B is Completed.");
    }
}