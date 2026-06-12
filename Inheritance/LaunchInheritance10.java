package src;

class Plane
{

}

class FighterPlane extends Plane
{

}



class Animal
{
    public void eat(String foodType)
    {
        System.out.println("Animals are required to eat");
    }

    private void sleep()
    {
        System.out.println("src.Animal is sleeping");
    }

//    public void running()
//    {
//        System.out.println("src.Animal is running");
//    }

    public Plane running()
    {
        System.out.println("src.Animal is running");
        Plane p = new Plane();
        return p;
    }

}

class Tiger extends Animal
{
//    void eat()    // cannot reduce the visibility while overriding inherited methods
//    {
//        System.out.println("src.Tiger hunts and eat");
//    }

    public void eat(String foodType)
    {
        System.out.println("src.Tiger hunts and eat");
    }

    public void eat()  // it is overloaded method of src.Child class ans hence it is specialized method of child class
    {
        System.out.println("src.Tiger hunts and eat");
    }

    protected void sleep()   // we can increase the visibility while overriding inherited methods
    {
        System.out.println("src.Tiger is sleeping");
    }
//
//    public int running()   // the primitive return types cannot be changed
//    {
//        System.out.println("src.Tiger is running to hunt");
//        return 10;
//    }

    public FighterPlane running()  // co-varient return type are such return where  there is is-A relationship
    {
        System.out.println("src.Tiger is running to hunt");
        FighterPlane fp = new FighterPlane();
        return fp;
    }

}


public class LaunchInheritance10
{
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        t.eat();

    }
}
