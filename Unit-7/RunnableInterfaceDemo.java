public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        RunnableInterface obj = new RunnableInterface();
        Thread f = new Thread();
        f.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("This is child main Thread");
        }
    }
}

class RunnableInterface implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is child Thread");
        }
    }
}
