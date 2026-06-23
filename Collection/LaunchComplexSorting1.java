import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
    int age;
    String name;
    double avg;

    public Cricketer(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer{" + "age=" + age + ", name='" + name + '\'' + ", avg=" + avg + '}';
    }
}
//implements
//anonymous inner class
//lambda

class Alpha1 implements Comparator<Cricketer>
{

    @Override
    public int compare(Cricketer o1, Cricketer o2)
    {
        if(o1.avg>o2.avg)
            return 1;
        else
            return -1;
    }

}

public class LaunchComplexSorting1
{
    public static void main(String[] args)
    {
        Cricketer c1 = new Cricketer(35,"Virat",88.8);
        Cricketer c2 = new Cricketer(36,"Rohit",78.8);
        Cricketer c3 = new Cricketer(39,"Dhoni",68.8);

        ArrayList<Cricketer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
//        Collections.sort(list);
//        Alpha1 a = new Alpha1();

//         Comparator<Cricketer> c = new Comparator<Cricketer>()
//        {
//
//            @Override
//            public int compare(Cricketer o1, Cricketer o2)
//            {
//                if(o1.avg>o2.avg)
//                    return 1;
//                else
//                    return -1;
//            }
//
//        };

        Comparator<Cricketer> c = (Cricketer o1, Cricketer o2)->{
            {
                if(o1.avg>o2.avg)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(list,c);
        System.out.println(list);

    }
}
