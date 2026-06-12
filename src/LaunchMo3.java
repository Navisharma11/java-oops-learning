



public class
LaunchMo3
{
    public static void main(String[] args)
    {
        System.out.println("Main method with String of args[]");
        main(44);
        main("Navi",11);
    }

    public static void main(int arg)
    {
        System.out.println("Main method with int of arg");
    }


    public static void main(int[] arg)
    {
        System.out.println("Main method with int[] of arg");
    }


    public static void main(String name,int age)
    {
        System.out.println("Main method with int and String of arg");
    }




}
