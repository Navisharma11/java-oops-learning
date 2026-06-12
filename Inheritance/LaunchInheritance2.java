package src;//
//=> Inheritance refers to the process of one class acquiring properties and behavior(methods) of another class
//
//It is also refers to writing code as hierarchy of classes rather just one class
//
//Inheritance can be achieved using extends keyword
//
//Inheritance promotes is-A relationship
//
//A class which acquires properties and behaviour(methods) of another class is referred as Inheritance_package.Child class or derived class or Sub class
//
//A class from where another class is acquiring(Inheriting) properties and behaviour(methods) is referred as Inheritance_package.Parent class or Base class or Super class
//
//A class can have many child classes i.e. One parent class can have multiple child classe
//
//Private members of a class will not get Inherited. This is to ensure Encapsulation doesn't get affected.
//
//Multi Level Inheritance allowed i.e. one child can have its parent And it can have its own parent(reffer code file)
//
//Object class is a parent of all classes in java
//
//If a class doesn't extends any class explicitily then by default it extends Object class
//
//Multiple Inheritance is not allowed in java i.e. A class cannot extends multiple classes Or one child class
//cannot have multiple parent classes as it will lead to ambiguity and Diamond Shaped Problem
//
//=>Cyclic Inheritance is not allowed in java
//
//Constructor do not participate in Inheritance however they do get executed when we create instance of child class
//because of super() call present in child class Constructor


class AeroPlane  // extends Object class
{
    void fly()
    {
        System.out.println("src.AeroPlane flies");
    }

    void landing()
    {
        System.out.println("src.AeroPlane is landing");
    }
}

class CargoPlane // extends Object
{

}

//class CommercialPlane extends src.CargoPlane,src.AeroPlane // extends Aeroplane  // =>class cannot extends multiple classes
//{
//
//}

class PassengerPlane extends AeroPlane
{
    void fly()
    {
        System.out.println("Passenger plane flies at medium height");
    }

    void takeOff()
    {
        System.out.println("Passenger plane is taking Off");
    }

}


public class LaunchInheritance2
{
    public static void main(String[] args)
    {
//        src.CargoPlane cp = new src.CargoPlane();
//        cp.fly();
//        cp.landing();


        AeroPlane pp = new PassengerPlane(); // upCasting
        pp.fly();
        pp.landing();
        ((PassengerPlane) pp).takeOff(); // downCasting



//        CommercialPlane c = new CommercialPlane();
//        c.fly();
//        c.landing();


    }
}
