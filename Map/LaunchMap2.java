import javax.swing.*;
import java.util.*;

interface Alpha
{
    interface Beta
    {
        static void disp()
        {
            System.out.println("Static method of an inner interface");
        }
    }
}



public class LaunchMap2
{
    public static void main(String[] args)
    {
//        Alpha.Beta.disp();
        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(1,"Java");//Entry --> Map (Entry is an inner interface of Map)
        hm1.put(2,"DSA");
        hm1.put(3,"SpringBoot");
        System.out.println(hm1);
        String data = hm1.get(3);
        System.out.println(data);
        System.out.println("****************************");
        Collection<String> values = hm1.values();
        Iterator<String> itr = values.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("**************************");
        Set<Integer> keys = hm1.keySet();
        Iterator<Integer> itr2 = keys.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("**************************");
        Set entry = hm1.entrySet();
        Iterator itr3 = entry.iterator();
        while(itr3.hasNext()){
            Map.Entry pair = (Map.Entry) itr3.next();
            System.out.println("Key : " + pair.getKey() +" value : " + pair.getValue());
        }

    }
}
