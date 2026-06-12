//Constructor
//
//Definition:
//
//A constructor is a special method whose name is the same as the class name and it does not have any explicit return type.
//
//Key Points:
//
//Constructor is invoked (called) automatically during object creation.
//If a programmer does not define any constructor, then:
//The Java compiler automatically provides a default constructor
//This default constructor is zero-parameter (no arguments)
//If there is a constructor coded in a class then java compiler would not include any default constructor
//We can have multiple constructors in a class. Creating multiple constructors with same name and different parameters is reffered as Constructor overloading

// to be continued........

//this keyword:
//this keyword will have address of currently running instance/object i.e currently whichever object is getting executed it will refer to that object instance.
//It will be used inside setter and constructor to differentiate local and instance variable and to assign data to instance variable from local variable. Solution for shadowing problem)

class Dog
{
    private int cost;
    private String name;
    private String color;

    Dog(int cost,String name,String color)
    {
         this.cost=cost;
         this.name=name;
         this.color=color;
    }


    Dog()
    {
        System.out.println("Zero param constructor");
        cost = 4545;
        name = "Lobo";
        color = "brown";
    }



    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



public class LaunchConstructor
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog(444,"sheru","white ");

        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println("*****************************************");

        Dog d2 = new Dog();
        System.out.println(d2.getCost());
        System.out.println(d2.getName());
        System.out.println(d2.getColor());

    }
}
