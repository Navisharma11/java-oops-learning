package basics;

public class LaunchThread1 extends Thread
{
    public LaunchThread1()
    {

    }

    public LaunchThread1(String name)
    {
        super(name);
    }

    public static void main(String[] args)
    {
        System.out.println("Main Thread Started");

//        LaunchThread1 t1 = new LaunchThread1();
//        LaunchThread1 t2 = new LaunchThread1();
//
//        t1.setName("MyThread1");
//        t2.setName("MyThread2");

        LaunchThread1 t1 = new LaunchThread1("MyThread1");
        LaunchThread1 t2 = new LaunchThread1("MyThread2");

        t1.start();
        t2.start();

    }

    public void run()
    {
        System.out.println("Task for my threads");
    }

}
