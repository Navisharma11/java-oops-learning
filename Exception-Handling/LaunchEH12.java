import java.util.Scanner;

class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }

}

class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }

}


class Applicant
{
    int age;

    public void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly Enter Your Age");
        age = scan.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException
    {
        if(age >= 18 && age <= 60)
        {
            System.out.println("Proceed with License Application");
        }
        else if(age < 18)
        {
            UnderAgeException uae = new UnderAgeException("Have Patience Kiddo! Your Time Will Come");
            System.out.println(uae.getMessage());
            throw uae;
        }
        else
        {
            OverAgeException oae = new OverAgeException("Your Time is near! Rest at home");
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}


class RTO
{
    public void initiate()
    {
        Applicant app = new Applicant();
        try {
            app.input();
            app.verify();
        }
        catch (UnderAgeException | OverAgeException e){
            System.out.println("Try Again!");
            try {
                app.input();
                app.verify();
            }
            catch (UnderAgeException | OverAgeException e2){
                System.out.println("You're Blocked to apply for license due to age related restrictions");
            }
        }

    }
}


public class LaunchEH12
{
    public static void main(String[] args)
    {
        System.out.println("License Application");
        RTO rto = new RTO();
        rto.initiate();

    }
}
