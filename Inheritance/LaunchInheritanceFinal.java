package src;//final class src.Plane1
//{
//    public void fly()
//    {
//        System.out.println("src.Plane is Flying");
//    }
//
//}

class  Plane1
{
    static
    {
        System.out.println("Static of parent");
    }


//    public final src.Plane1() // Illegal to make constructor final
//    {
//
//    }

    final static int b = 20;
    final int age = 10;
    final public void fly()
    {
        //age = 20;
        System.out.println("src.Plane is Flying");
    }

//    final public static void fl()
//    {
//        //age = 20;
//        System.out.println("src.Plane is Flying");
//    }

}

class FighterPlane1 extends Plane1
{
    static
    {
        System.out.println("Static of child");
    }



//    public void fly()  // cannot override the final method of src.Plane1
//    {
//        System.out.println("src.Plane is Flying");
//    }

}



public class LaunchInheritanceFinal
{
    public static void main(String[] args)
    {
        FighterPlane1 fp = new FighterPlane1();
        fp.fly();

    }
}
