import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFS   // Fail Safe
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList al = new  CopyOnWriteArrayList();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
