
interface P{
    void show(String s);
}


// interface -> normal interface, SAM(Single Abstract Method) - Functional Interface, Marker(interface with no method)


@FunctionalInterface
interface Person{
    int add(int x,int y);
}

class PersonImpl implements Person{
    public int add(int x,int y){
        return x+y;
    }
}


//class R extends P{
//    public void show(){
//        System.out.println("in show");
//    }
//}

public class LambdaDemo
{
    public static void main(String[] args) {

//        P obj = new P(){
//            public void show(){
//                System.out.println("in show");
//            }
//        };
//        obj.show();

         P obj = s -> System.out.println(s.length());

         obj.show("Navi");



//        Person person = () -> System.out.println("Good Night..");
//
//
//        person.getData();


        Person obj1 = (x,y) -> x+y;    // anonymous inner class
        Person obj2 = (x,y) -> x+y;



        int result = obj1.add(5,6);
        System.out.println(result);


        int result1 = obj2.add(11,11);
        System.out.println(result1);


    }
}
