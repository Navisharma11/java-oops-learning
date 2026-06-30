package classlevellocking;

public class Atm extends Thread
{

    @Override
    public void run()
    {
        System.out.println("Withdrawal");
        HSBCBank.withdrawal(4000);
    }

}
