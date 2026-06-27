class MyCar1 implements Runnable
{
    @Override
    public void run() {
        try
        {
            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(4000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " has entered into Car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has started to drive the Car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has came back and parked the Car");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


public class LaunchThread7
{
    public static void main(String[] args)
    {
        MyCar1 car = new MyCar1();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("RAMESH");
        t2.setName("SURESH");
        t3.setName("DINESH");

        t1.start();
        t2.start();
        t3.start();

    }
}
