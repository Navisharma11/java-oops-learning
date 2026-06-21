import java.util.LinkedList;

public class LaunchLinkedList
{
    public static void main(String[] args)
    {
        LinkedList ll1 = new LinkedList();

        ll1.add(10);
        ll1.add("Java");
        ll1.add("Bengaluru");
        ll1.add(20);
//        System.out.println(ll1);
        ll1.addFirst(44);
        ll1.addLast(54);
        ll1.add(2,"Telusko");
//        System.out.println(ll1);
        ll1.offer("DevOps");
//        System.out.println(ll1);
        ll1.offer("Junit5");
//        System.out.println(ll1);
        ll1.offerFirst("SpringBoot");
        System.out.println(ll1);
        System.out.println(ll1.peek());
        System.out.println(ll1);
        System.out.println(ll1.poll());
        System.out.println(ll1);
        ll1.add("Telusko");
        System.out.println(ll1);


    }
}
