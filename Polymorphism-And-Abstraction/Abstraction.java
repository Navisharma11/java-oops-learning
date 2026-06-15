// final abstract class AeroPlane3  // illegal
abstract class AeroPlane3
{
    public AeroPlane3(){
        System.out.println("AeroPlane3 constructor");
    }
//    abstract int age; // illegal modifier for the field age; only public, protected, private, static, final, transient & volatile are permittedd
//    public final abstract void takingOff();   // illegal
    public abstract void takingOff();

    public abstract void fly();

    public abstract void landing();

}

class CargoPlane3 extends AeroPlane3
{
    public void takingOff()
    {
        System.out.println("CargoPlane3 requires longer runway to takeOff");
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

class PassengerPlane3 extends AeroPlane3
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


class FighterPlane3 extends AeroPlane3
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


class Airport1
{
    public void permit(AeroPlane3 aeroplane)
    {
        aeroplane.takingOff(); // 1:M
        aeroplane.fly();
        aeroplane.landing();
    }
}



public class Abstraction
{

    public static void main(String[] args)
    {
//        AeroPlane3 ar = new AeroPlane3();  We cannot create instance/objectn of an abstract class

        CargoPlane3 cp = new CargoPlane3();

        FighterPlane3 fp = new FighterPlane3();

        PassengerPlane3 pp = new PassengerPlane3();

        Airport1 a = new Airport1();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);

    }

}
