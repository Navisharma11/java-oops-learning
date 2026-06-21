import java.util.ArrayList;
import java.util.Iterator;

public class LaunchAccessingData
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

//        double d = (double)al.get(2);
//        System.out.println(d);

//        for(int i=0;i<al.size();i++){
//            System.out.println(al.get(i));
//        }

//        for(Object o:al){
//            System.out.println(o);
//        }

//          for(int i=0;i<al.size();i++){
//            Integer data = (Integer) al.get(i);
//            System.out.println(data);
//            al.add(44);
//        }

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            al.add(44);
        }


    }
}
