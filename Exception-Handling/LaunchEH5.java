import java.util.Scanner;

class Alpha1 {
    public void calc() throws ArithmeticException{
        System.out.println("Alpha Connection Established");


            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly Enter the Numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly Enter the Denominator for division");
            int d = scan.nextInt();

            int res = n / d;

            System.out.println("Result is " + res);


        System.out.println("Alpha Connection Terminated");
    }
}




public class LaunchEH5
{
    public static void main(String[] args)
    {
        try {
            System.out.println("Main Connection Established");
            Alpha1 a = new Alpha1();
            a.calc();
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught at main method");
        }
        System.out.println("Main Connection Terminated");

    }
}
