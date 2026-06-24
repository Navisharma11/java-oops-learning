import java.util.*;
import java.util.Map.Entry;

class Passport
{
    private String name;
    private String city;
    private String country;

    public Passport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport{" + "name='" + name + '\'' + ", city='" + city + '\'' + ", country='" + country + '\'' + '}';
    }
}


public class LaunchMap3
{
    public static void main(String[] args)
    {
        System.out.println("Passport Information Application");
        Passport pass1 = new Passport("Rohan","Bengaluru","India");
        Passport pass2 = new Passport("Rohit","Mumbai","India");
        Passport pass3 = new Passport("Rahul","Calgary","Canada");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(201);
        Integer id3 = Integer.valueOf(301);

        HashMap<Integer,Passport> hm = new HashMap<>();
        hm.put(id1,pass1);
        hm.put(id2,pass2);
        hm.put(id3,pass3);
//        System.out.println(hm);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly Enter Your Passport Number");
        Integer userN = scan.nextInt();

        Set<Entry<Integer,Passport>> entry = hm.entrySet();
        Boolean flag = false;
        Iterator<Entry<Integer, Passport>> itr = entry.iterator();
        while(itr.hasNext()){
            Entry<Integer, Passport> keyValue = itr.next();
            Integer key = keyValue.getKey();
//            System.out.println(key);
            if(key==userN)
            {
                System.out.println("Please find your passport details below");
                System.out.println(keyValue.getValue());
                flag = true;
            }
//            System.out.println("repeating loop");
        }
        if(flag==false)
        {
            System.out.println("Unable to Fetch your Information based on passport id given");
        }

    }
}
