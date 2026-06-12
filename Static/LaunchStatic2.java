//-->Static variables memory will be allocated on Heap area during class loading it self ( Class loader subsystem --> Linking --> Preparation ) Jvm
// would also initialize default value to static variable at this stage.
//
//-->Static block will be executed during class loading it self ( Class loading --> Initialization)
//
//-->If there are few statements to be executed even before main method we can use static block.
//
//
//-->Static variables memory will be allocated only once in heap area during class loading. When ever we have common copy of data which has to be shared among all the object of a class then we must use static variable as memory will
// be allocated only once and same copy of data will be used among all objects of a class.
//
//-->Java Instance Initialization block will be executed during the object creation before the body of Constructor.
//
// Static methods can be invoked directly with class name. Also it can be invoked using reference of Object also
//
//--> When ever we have any common statements which must be executed for every Constructor we can include that within a Java Instance initiliazation block (Java block)
//
//--> Instance initialization block can be used to initialize the instance variables.
//============================================================================================
//static methods do get inherited(We can inherit static methods)
//
//When ever we try to override static method in src.Child class it will hide the parent class static method it will behave like a specilized method of child class(Overridind would not occur here). We cannot ovverride
// the static method in child class.
//
//



class Demo20
{
        static int a,b,c;
        int x,y,z;
    static
    {
        System.out.println("Static Initialization block");
        a=10;
        b=20;
        c=30;
    }

    static void disp()
    {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }

    {
        x=44;
        y=45;
        z=46;
        System.out.println("Java Intitialization block");
    }

    Demo20()
    {
        System.out.println("Constructor");
    }

    void disp2()
    {
        System.out.println("Non static method");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("z : "+z);
    }
}


public class LaunchStatic2
{
    public static void main(String[] args)
    {
       Demo20.disp();

       Demo20 d2 = new Demo20();
       d2.disp2();

       Demo20 d3 = new Demo20();
       d2.disp2 ();
    }

}
