public class DeadLock {
    final String str1;
    final String str2;

    DeadLock() {
        str1 = "Java";
        str2 = "Python";
    }

    Thread thread1 = new Thread() {
        public void run() {
            synchronized (str1) {
                try {
                    System.out.println(Thread.currentThread().getName() + "Locked" + str1);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (str2) {
                System.out.println(Thread.currentThread().getName() + "Locked" + str2);
            }
        }
    };

    Thread thread2 = new Thread() {
        public void run() {
            synchronized (str2) {
                try {
                    System.out.println(Thread.currentThread().getName() + "Locked" + str2);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (str1) {
                System.out.println(Thread.currentThread().getName() + "Locked" + str1);
            }
        }
    };

    public static void main(String[] args) {
       DeadLock obj = new DeadLock();
        obj.thread1.start();
        obj.thread2.start();
    }
}
