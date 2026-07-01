import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchStream
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        list.add(14);
        list.add(5);
        list.add(72);
        list.add(18);
        list.add(12);;
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

//        Stream<Integer> streamData1 = list.stream();
//        Stream<Integer> sortedStream = streamData1.sorted();
//        Stream<Integer> streamData2 = sortedStream.map(n -> n * 2);
//        streamData2.forEach((n)->System.out.println(n));

//
//        Stream<Integer> streamData2 = streamData1.map((n)->n*2);
//        streamData2.forEach((n)->System.out.println(n));

                list.stream()
                .sorted()
                .map(n->n*2.5)
                .forEach(n->System.out.println(n));

//                String n = "ALIEN";
//
//                int length = n.toLowerCase()
//                        .toUpperCase()
//                        .concat("Java").length();


        List<String> list2 = new ArrayList<>();

        list2.add("Telusko");
        list2.add("Alien");
        list2.add("Java");

        System.out.println(list2);

        Set<String> set = list2.stream().collect(Collectors.toSet());

        List<String> list3 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(list3);

        list2.stream().


    }
}
