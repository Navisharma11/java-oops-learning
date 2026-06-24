import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Telusko
{
    private Integer id;

    private String courseName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Telusko{" + "id=" + id + ", courseName='" + courseName + '\'' + '}';
    }

    public Telusko(Integer id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Telusko() {
        super();
    }
}


public class LaunchMap1
{
    public static void main(String[] args)
    {
        //In hashmap order of insertion is not maintained
        HashMap hm1 = new HashMap();
        hm1.put(1,"Java");
        hm1.put(2,"SpringBoot");
        hm1.put(3,"MicroServices");

        System.out.println(hm1);
        System.out.println("**************************");

        Telusko telusko = new Telusko(1,"Java");
//
//        HashMap hm2 = new HashMap();
//
//        hm2.put("Alien","Java");
//        hm2.put(telusko,"SpringBoot");//key-value
//        hm2.put(4,"Microservices");
////        hm2.put(4,"Microservices");//key must be unique and value need not to be unique
//        hm2.put(5,"Microservices");
//        hm2.put(null,"Microservices");//key can be null
//        hm2.put(6,null);//value can also be null
//        System.out.println(hm2);


////     In LinkedHashMap order of insertion is maintained
//        LinkedHashMap hm2 = new LinkedHashMap();
//
//        hm2.put("Alien","Java");
//        hm2.put(telusko,"SpringBoot");//key-value
//        hm2.put(4,"Microservices");
////        hm2.put(4,"Microservices");//key must be unique and value need not to be unique
//        hm2.put(5,"Microservices");
//        hm2.put(null,"Microservices");//key can be null
//        hm2.put(6,null);//value can also be null
//        System.out.println(hm2);



//        HashMap<Integer,String> hm2 = new HashMap<>();
//        hm2.put(1,"Java");//Entry
//        hm2.put(2,"SpringBoot");
////        hm2.put("Java","junit5");
//        System.out.println(hm2);


////     In Hashtable order of insertion is not maintained
//        Hashtable ht = new Hashtable();
//        ht.put(1,"Alien");
//        ht.put(2,"Alien");
////        ht.put(null,"SpringBoot");//key cannot be null
////        ht.put("Hinernate",null);//value cannot be null
//        System.out.println(ht);


        //output is based on sorted key values
        TreeMap tm = new TreeMap();
        tm.put(3,"Hibernate");
        tm.put(2,"SpringBoot");
//        tm.put(null,"Java");//key cannot be null
        tm.put(4,null);//value can be null
        System.out.println(tm);


    }
}
