import java.util.*;

public class Launchl
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

//        List<Integer> list2 = new LinkedList<>();

        List<Integer> l = Arrays.asList(10,20,30,40);

    }
    public static Iterable<Integer> getIntegers()
    {
//        return new ArrayList<Integer>();
        return new TreeSet<Integer>();
    }

    public static List<Integer> getInteger()
    {
        return new ArrayList<Integer>();
//        return new TreeSet<Integer>();
    }
}
