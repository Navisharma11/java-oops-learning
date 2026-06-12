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



class Student
{
    int id;
    String name;
    String city;
    static int count;




    {
        count++;
    }

    Student()
    {
        System.out.println("Zero param constructor");
//        count++;
    }

    Student(int id,String name,String city)
    {
        this.id=id;
        this.name=name;
        this.city=city;
//        count++;
    }
}



public class LaunchStatic3
{
    public static void main(String[] args)
    {
        Student st1 = new Student(1,"Rohan","Delhi");
        System.out.println("no of objects created : "+ Student.count);
        Student st2 = new Student(2,"Rohit","Mumbai");
        System.out.println("no of objects created : "+ Student.count);
        Student st3 = new Student(3,"Ramesh","Punjab");
        System.out.println("no of objects created : "+ Student .count);
        Student st4 = new Student();
        System.out.println("no of objects created : "+ Student .count);
    }
}
