interface Alpha<T>
{

}

class Generics<T> implements Alpha<String>
{
    private T ref;

    public Generics(T ref)
    {
        this.ref = ref;
    }

    public void disp()
    {
        System.out.println("The type of t is :"+ ref.getClass().getName());
    }

    public T getRef()
    {
        return ref;
    }

}


public class LaunchGen2
{
    public static void main(String[] args)
    {
        Generics<Integer> g = new Generics(44);
        g.disp();
        System.out.println(g.getRef());

//        Generics<Integer> g = new Generics("Java ");   // CE

        Generics<String> g2 = new Generics("SpringBoot");
        g2.disp();
        System.out.println(g2.getRef());
    }
}
