//-->Static variables memory will be allocated on Heap area during class loading it self ( Class loader subsystem --> Linking --> Preparation ) Jvm
// would also initialize default value to static variable at this stage.
//
//-->Static block will be executed during class loading it self ( Class loading --> Initialization)
//
//-->If there are few statement//-->Static variables memory will be allocated on Heap area during class loading it self ( Class loader subsystem --> Linking --> Preparation ) Jvm
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






import java.util.Scanner;

class Farmer
{
    float principleAmount;
    float timeDuration;
    float simpleInterest;
    static float rateOfInterest;

    static
    {
        rateOfInterest = 2.5f;
    }

    void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly Enter the loan amount required in rupees");
        principleAmount = scan.nextFloat();
        System.out.println("Kindly enter time duration required to repay loan in months");
        timeDuration = scan.nextFloat();

    }

    void compute()
    {
        simpleInterest = (principleAmount*timeDuration*rateOfInterest)/100.0f;

    }

    void disp()
    {
        System.out.println("Hello, Your Simple Interest is :"+ simpleInterest);
    }
}



public class LaunchStaticApp
{

    public static void main(String[] args)
    {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        Farmer f3 = new Farmer();

        System.out.println("Farmer1: ");
        f1.acceptInput();
        f1.compute();
        f1.disp();

        System.out.println( );
        System.out.println("Farmer2: ");
        f2.acceptInput();
        f2.compute();
        f2.disp();

        System.out.println();
        System.out.println("Farmer3: ");
        f3.acceptInput();
        f3.compute();
        f3.disp();


    }

}
