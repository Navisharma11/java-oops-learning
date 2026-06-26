
import java.util.Scanner;

class Alpha2 implements Runnable
{
    @Override
    public void run()
    {
        banking();
    }

    public void banking()
    {
        System.out.println("Banking Activity Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user number");
        int un = sc.nextInt();
        System.out.println("Enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking Activity Terminated");
    }

}

class Beta2 implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            printingStars();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printingStars() throws InterruptedException {
        System.out.println("Printing Activity Started");
        for(int i=0;i<=4;i++){
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing Activity Terminated");
    }
}

class Gamma2 implements Runnable
{
    @Override
    public void run() {
        try {
            focus();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    public void focus() throws InterruptedException {
        System.out.println("Printing Important Message Started");
        for(int i=0;i<=4;i++){
            System.out.println("Focus is the key to master any skills ");
            Thread.sleep(4000);
        }
        System.out.println("Printing Important Message Terminated");
    }
}




public class LaunchThread4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started.....");

        Alpha2 a = new Alpha2();
        Beta2 b = new Beta2();
        Gamma2 g = new Gamma2();

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(g);

        System.out.println(thread1.isAlive());//false
        System.out.println(thread2.isAlive());//false
        System.out.println(thread3.isAlive());//false

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(thread1.isAlive());//true
        System.out.println(thread2.isAlive());//true
        System.out.println(thread3.isAlive());//true

//        a.banking();
//        b.printingStars();
//        g.focus();

        System.out.println("Application Terminated.....");
    }
}
