import java.util.Scanner;
class InvalidCustomerException extends Exception
{
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }

}


class Atm
{
    private int acc = 4545;
    private int pw = 1234;

    int accountNo;
    int password;

    public void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kindly Enter account number");
        accountNo = sc.nextInt();

        System.out.println("Kindly Enter the password");
        password = sc.nextInt();
    }

    public void verify() throws InvalidCustomerException
    {
        if(acc == accountNo && pw == password){
            System.out.println("Proceed to withdraw cash");
        }
        else{
            InvalidCustomerException ice = new InvalidCustomerException("Invalid credentials! ");
            System.out.println(ice.getMessage());
            throw ice;

//            throw new InvalidCustomerException("Invalid credentials! ");
        }
    }
}


class Bank
{
    public void initiate() {
            Atm atm = new Atm();
            try
            {
            atm.input();
            atm.verify();
            }
        catch (InvalidCustomerException ice)
        {
            System.out.println("Try Again!");
            try
            {
                atm.input();
                atm.verify();
            }
            catch (InvalidCustomerException ice2)
            {
                System.out.println("Try Again!");
                try
                {
                    atm.input();
                    atm.verify();
                }
                catch (InvalidCustomerException ice3)
                {
                    System.out.println("Youre a legend, Cannot be given any more chances");
                }
            }
        }
    }
}



public class LaunchEH11
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.initiate();

    }
}
