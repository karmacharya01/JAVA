class ThreadPriorityDemo extends Thread{
    public void run(){
        System.out.println("Inside the run() method");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Main Thread");

        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();

        System.out.println("Priority of the thread t1 is :" +t1.getPriority());
        System.out.println("Priority of the thread t2 is :" +t2.getPriority());
        System.out.println("Priority of the thread t3 is :" +t3.getPriority());

        System.out.println();
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);

        System.out.println("Priority of the thread t1 is :" +t1.getPriority());
        System.out.println("Priority of the thread t2 is :" +t2.getPriority());
        System.out.println("Priority of the thread t3 is :" +t3.getPriority());

        System.out.println();
        System.out.println("Currently Executing The Thread :"+Thread.currentThread().getName());
        System.out.println("Priority od the main therad is: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
    }
}