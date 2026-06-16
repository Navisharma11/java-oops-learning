interface Telusko55
{
    void show();

    default void disp()
    {
        System.out.println("src.Telusko is coming up with fast tract spring boot course");
    }

    static void announcement()
    {
        System.out.println("8 days fastract spring boot course is announced by src.Telusko");
    }

}

class Alien implements Telusko55
{
    public void show()
    {
        System.out.println("Hello Aliens, Welcome back!");
    }

//    public void disp()
//    {
//        System.out.println("src.Telusko is coming up with new fast tract spring boot course ");
//    }
}



public class LaunchInterface3
{
    public static void main(String[] args)
    {
        Alien a = new Alien();
        a.show();
        a.disp();


        Telusko55.announcement();

    }
}
