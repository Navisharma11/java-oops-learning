import java.util.ArrayList;
import java.util.Objects;

class Employee
{
    private Integer id;

    private String name;

    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


public class LaunchGen1
{
    public static void main(String[] args)
    {
        //typeSafety
        int ar[] = new int[3];

        ar[0] = 14;
        ar[1] = 24;
        ar[2] = 34;

        int data = ar[0];

        //typeSafety
        String str[] = new String[3];
        str[0] = "Telusko";
        str[1] = "Java";
        str[2] = "Alien";

        String info = str[1];



        //no typeSafety
        ArrayList al = new ArrayList();
        al.add("Telusko");
        al.add("Java");
        al.add("Alien");
//        al.add(44);

        String s1 = (String) al.get(0);
        s1 = s1.toLowerCase();
        System.out.println(s1);

        String s2 = (String) al.get(1);
        s2 = s2.toLowerCase();
        System.out.println(s2);

        String s3 = (String) al.get(2);
        s3 = s3.toLowerCase();
        System.out.println(s3);

//        String s4 = (String) al.get(3);
//        s4 = s4.toLowerCase();
//        System.out.println(s4);
        System.out.println("************************");


        //typeSafety
        ArrayList<String> list = new ArrayList<>();//generics
        list.add("Java");
        list.add("SpringBoot");
        list.add("Microserices");
//        list.add(10);
        for(String d: list){
            System.out.println(d);
        }
        System.out.println("***************************");

        ArrayList<Employee> employee = new ArrayList<>();
//        employee.add("Java");  No
        employee.add(new Employee(1,"Navi","Chandigarh"));
        employee.add(new Employee(2,"Rohan","Chandigarh"));
        employee.add(new Employee(3,"Rohit","Mumbai"));

        for(Employee e:employee){
           System.out.println(e);
        }

//      ArrayList<int> e = new ArrayList<int>(); //primitive is not allowed

//        ArrayList<Object> e = new ArrayList<Integer>(); //Not allowed
        ArrayList<Integer> e = new ArrayList<Integer>();

    }
}
