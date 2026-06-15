class AeroPlane
{
    public void takingOff()
    {
        System.out.println("AeroPlane must takeoff in order to fly");
    }

//    public void fly()
//    {
//        System.out.println("AeroPlane is flying");
//    }

    public void landing()
    {
        System.out.println("AeroPlane is landing");
    }
}

class CargoPlane extends AeroPlane
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

class FighterPlane extends AeroPlane
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



public class LaunchPoly1
{
    public static void main(String[] args)
    {
      AeroPlane cp = new CargoPlane();
      cp.takingOff();
      cp.landing();
      // cp.fly();  // It is not possible by using the parent type reference accessing the child specialized behaviour directly
        ((CargoPlane) cp).fly(); // We have to change the behaviour

        System.out.println("******************************************");

      AeroPlane fp = new FighterPlane();
        fp.takingOff();
        fp.landing();
       // ((FighterPlane) fp).fly();  //  We have to change the behaviour
    }
}
