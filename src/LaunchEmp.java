//Encapsulation
//
//Definition:
//
//Encapsulation is the process of giving controlled access to data members (instance variables) of a class by making them private and using getters and setters.
//
//Key Points:
//
//It is the process of binding data members and methods into a single unit.
//It provides security to important components (data members) by:
//Making them private
//Allowing access through setters and getters
//
//How to achieve Encapsulation:
//
//Use private keyword
//Use setter methods
//Use getter methods

class Employee
{
    private int id;
    private String name;

    //setter
    void setId(int i)
    {
        id=i;
    }

    void setName(String  n)
    {
         name=n;
    }

    //getter
    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

}



public class LaunchEmp
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
      //  emp.id=1;
        emp.setId(1);
        emp.setName("Navi");


        Employee vmp = new Employee();
        //  vmp.id=4;
        vmp.setId(4);
        vmp.setName("Ravi");

//        System.out.println(emp.id);
        System.out.println(vmp.getId());
        System.out.println(vmp.getName() );



//        System.out.println(emp.id);
        System.out.println(emp.getId());
        System.out.println(emp.getName() );

    }
}
