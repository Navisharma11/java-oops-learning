public class LaunchWrapper
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println("a "+a);

//        Integer i = new Integer(10);
        Integer i = Integer.valueOf(10);
        System.out.println("i "+i);


      // Boxing : Converting primitive data type into its corresponding wrapper class
      // Auto Boxing : Automatically Converting primitive data type into its corresponding wrapper class by java compiler
        int n1 = 14;
        Integer n2 = n1;// auto Boxing
        Integer x = Integer.valueOf(n1); // Boxing


      // UnBoxing :  Converting wrapper class object back to its corresponding primitive data type
      // Auto UnBoxing : Automatically Converting wrapper class object back to its corresponding primitive data type bby java compiler
        Integer n3 = Integer.valueOf(44);
        int n4 = n3; //auto UnBoxing

        int n5 = n3.intValue(); // unBoxing


    }
}
