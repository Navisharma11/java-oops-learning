import java.util.Scanner;

class Alpha {
    public void calc() {
        System.out.println("Alpha Connection Established");

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly Enter the Numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly Enter the Denominator for division");
            int d = scan.nextInt();

            int res = n / d;

            System.out.println("Result is " + res);

        }
        catch (ArithmeticException e){
            System.out.println("Enter non zero number for denominator");
        }

        System.out.println("Alpha Connection Terminated");
    }
}

class Beta
{
    public void disp()
    {
        System.out.println("Beta Connection Established");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Beta Connection Terminated");
    }

}



public class LaunchEH4
{
    public static void main(String[] args)
    {
        System.out.println("Main Connection Established");
        Beta b = new Beta();
        b.disp();
        System.out.println("Main Connection Terminated");
    }
}
