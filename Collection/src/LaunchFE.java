import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LaunchFE
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(18);
        list.add(72);
        list.add(44);
        System.out.println(list);

//        for(Integer i:list)
//        {
//            int res = i*2;
//            System.out.println(res);
//        }
//        System.out.println(list);

//        Consumer<Integer> consumer = new Consumer<>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };

//        Consumer<Integer> consumer = (Integer n)->System.out.println(n);

        list.forEach((n)->System.out.println(n));

    }
}
