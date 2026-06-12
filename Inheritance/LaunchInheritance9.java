package src;

class Parent
{
    int i = 10;

    void disp()
    {
        System.out.println("Disp of src.Parent");
    }

}

class Child extends Parent
{
    int i = 100;

    void alpha()
    {
        System.out.println("src.Alpha");
        System.out.println(i);
        System.out.println(super.i);
//        disp();
        super.disp();
    }

    void disp()
    {
        System.out.println("Disp of src.Child");
    }
}



public class LaunchInheritance9
{
    public static void main(String[] args)
    {
//        src.Child c = new src.Child();
//        c.alpha();

       new Child().alpha();
//       new src.Child().disp();
    }
}
