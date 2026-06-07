class WaitNotifyDemo extends Thread {
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("This is the child thread:" + i);
            }
            notify();
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        WaitNotifyDemo waitNotifyDemo=new WaitNotifyDemo();
        waitNotifyDemo.start();
        synchronized (waitNotifyDemo) {
        System.out.println("This is tha main thread Wating for Child thread Completion");
        try{
            for (int i = 0; i <= 5; i++) {
                if(i==2){
                    waitNotifyDemo.wait();
                }
                System.out.println("Main Thread:"+i); 
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        }
    }
}