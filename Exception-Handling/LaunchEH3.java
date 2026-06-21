import java.util.Scanner;

public class LaunchEH3
{
    public static void main(String[] args) {
        System.out.println("Connection Established");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Kindly Enter the Numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly Enter the Denominator for division");
            int d = scan.nextInt();

            int res = n / d;

            System.out.println("Result is " + res);
        }
        catch (ArithmeticException e){
            System.out.println("Please enter non zero number");
        }

     try{
        System.out.println("Kindly enter size of an array");
            int size = scan.nextInt();

            int ar[] = new int[size];

            System.out.println("Kindly enter element to be inserted in an array");
            int elem = scan.nextInt();

            System.out.println("Kindly enter position at which element to be inserted");
            int index = scan.nextInt();
            ar[index] = elem;

            System.out.println("Data inserted in a array is " + ar[index]);
        }

        catch (NegativeArraySizeException e){
            System.out.println("Please don't be negative");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Be within your limits, Dont cross Boundaries");
        }

        catch (Exception e){
            System.out.println("Some Problem");
        }

        System.out.println("Connection Terminated");

    }
}
