import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Human
{
    int age;

    public void disp()
    {
        System.out.println("Humans are best creature");
    }
}

class Students extends Human
{

}

class Employeee
{

}

public class LaunchGen3
{
    public static void main(String[] args)
    {
//        Object obj = new Object();
//        String s = new String("Alien");
//
//        obj = s;
//        s = obj; error or downcast

        Human h = new Human();
        Students s = new Students();

        h=s;
//        s=h;  //ce //downcasting

        ArrayList<Human> hlist1 = new ArrayList<>();
        ArrayList<Students> slist1 = new ArrayList<>();
//        hlist1=slist1;  //Ce

//        ArrayList<?> hlist2 = new ArrayList<>();//? unKnown --> wild card
//        ArrayList<Students> slist2 = new ArrayList<>();
//        hlist2=slist2;

//        ArrayList<? extends Human> hlist3 = new ArrayList<>();//upperBound
//        ArrayList<Students> slist3 = new ArrayList<>();
//        ArrayList<Employeee> elist3 = new ArrayList<>();
//        ArrayList<Object> olist3 = new ArrayList<>();
//        hlist3=slist3;
//        hlist3=elist3;//ce
//        hlist3=olist3;//ce

//
//        ArrayList<? super Human> hlist3 = new ArrayList<>();//lower Bound
//        ArrayList<Students> slist3 = new ArrayList<>();
//        ArrayList<Employeee> elist3 = new ArrayList<>();
//        ArrayList<Object> olist3 = new ArrayList<>();

//        hlist3-elist3;   ce
//        hlist3=slist3;   ce
//        hlist3 = olist3;

//        ArrayList<Human> hlist = new ArrayList<>();
//        hlist.add(new Human());
//        hlist.add(new Human());
//        hlist.add(new Human());
//        invockDisp(hlist);

        ArrayList<Students> slist = new ArrayList<>();
        slist.add(new Students());
        slist.add(new Students());
        slist.add(new Students());
//        invockDisp(slist);

    }
    public static void invockDisp(List<? extends Human> list)
//       public static void invockDisp(List<Human> list)
    {
        for(Human h:list)
        {
            System.out.println(h);
        }

    }
}
