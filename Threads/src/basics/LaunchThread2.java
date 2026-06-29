package basics;

public class LaunchThread2 implements Runnable
{
    public static void main(String[] args)
    {
//        LaunchThread2 lt = new LaunchThread2();
        System.out.println("Main Thread");
        Thread t = new Thread(new LaunchThread2());
        t.start();

//        Runnable r = ()->System.out.println("Task of thread 2");

        Thread t2 = new Thread(()->System.out.println("Task of thread 2"));
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("Task of thread");
    }
}
