class AeroPlane2
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

class CargoPlane2 extends AeroPlane2
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

class PassengerPlane2 extends AeroPlane2
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


class FighterPlane2 extends AeroPlane2
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


class Airport
{
    public void permit(AeroPlane2 aeroplane)  // AeroPlane2 aeroplane = new CargoPlane2();
    {
        aeroplane.takingOff(); // 1:M
        aeroplane.fly();
        aeroplane.landing();
    }
}


public class LaunchPoly3
{
    public static void main(String[] args)
    {
        CargoPlane2 cp = new CargoPlane2();

        FighterPlane2 fp = new FighterPlane2();

        PassengerPlane2 pp = new PassengerPlane2();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);


    }
}
