package src;

class Demo4
{
    int x = 10;
    static int a;
    public static void disp()
    {
        a=10;
        System.out.println(a+" parent class disp");
    }

    public void show()
    {
        System.out.println("Show of parent");
    }

}

class Demo5 extends Demo4
{

    public static void disp()  // method hiding  //static method will get inherited in the child class but if we try to override then it is not overridden
    {                                            //static inherited method will remain as it is this will act like a specialized method
        a=10;
        System.out.println(a + " src.Child class disp");
    }


    public void show()
    {
        x=20;
        System.out.println(x+" ;x");
        System.out.println(super.x+" ;x");
        System.out.println("Show of child");
    }
}


public class LaunchInheritance11
{
    public static void main(String[] args)
    {
        Demo4 d = new Demo5();
        d.disp();
        d.show();
       // src.Demo4.disp();

        System.out.println("*****************************");
       // src.Demo5.disp();

//        src.Demo5 d2 = new src.Demo5();
//        d2.disp();
    }
}
