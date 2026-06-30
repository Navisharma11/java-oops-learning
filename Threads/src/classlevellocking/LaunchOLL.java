package classlevellocking;

public class LaunchOLL
{
    public static void main(String[] args)
    {
        HSBCBank bank1 = new HSBCBank();
        HSBCBank bank2 = new HSBCBank();


        Atm atm = new Atm();
        atm.setName("ATM Thread");

        GooglePay gpay = new GooglePay();
        gpay.setName("GPAY Thread");

        PhonePe ppay = new PhonePe(bank2);
        ppay.setName("PhonePe Thread");

        atm.start();
        gpay.start();
        ppay.start();

    }
}
