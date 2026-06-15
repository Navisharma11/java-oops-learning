class AeroPlane1
{
    public void takingOff()
    {
        System.out.println("AeroPlane must takeoff in order to fly");
    }

    public void fly()
    {
        System.out.println("AeroPlane is flying");
    }

    public void landing()
    {
        System.out.println("AeroPlane is landing");
    }
}

class CargoPlane1 extends AeroPlane1
{
    public void takingOff()
    {
        System.out.println("CargoPlane requires longer runway to takeOff");
    }

    public void fly()
    {
        System.out.println("CargoPlane is flying");
    }

    public void landing()
    {
        System.out.println("CargoPlane is landing");
    }

}

class PassengerPlane1 extends AeroPlane1
{
    public void takingOff()
    {
        System.out.println("PassengerPlane1 requires medium runway to takeOff");
    }

    public void fly()
    {
        System.out.println("PassengerPlane1 is flying");
    }

    public void landing()
    {
        System.out.println("PassengerPlane1 is landing");
    }

}


class FighterPlane1 extends AeroPlane1
{
    public void takingOff()
    {
        System.out.println("FighterPlane requires shorter runway to takeOff");
    }

    public void fly()
    {
        System.out.println("FighterPlane is flying");
    }

    public void landing()
    {
        System.out.println("FighterPlane is landing");
    }
}




public class LaunchPoly2
{
    public static void main(String[] args)
    {
        CargoPlane1 cp = new CargoPlane1();



        FighterPlane1 fp = new FighterPlane1();



        PassengerPlane1 pp = new PassengerPlane1();



        AeroPlane1 aeroplane;

        aeroplane = cp;

        aeroplane.takingOff();
        aeroplane.fly();
        aeroplane.landing();

        System.out.println("**************************************");

        aeroplane = fp;

        aeroplane.takingOff(); // 1:M
        aeroplane.fly();
        aeroplane.landing();

        System.out.println("**************************************");

        aeroplane = pp;

        aeroplane.takingOff(); // 1:M
        aeroplane.fly();
        aeroplane.landing();

    }
}
