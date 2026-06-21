import java.io.IOException;
//
//class Parent
//{
//    public void work()
//    {
//        System.out.println("Parents works hard");
//    }
//}
//
//class Child1 extends Parent
//{
//    public void work() throws ArithmeticException
//    {
//        System.out.println("Child 1 also works hard");
//    }
//
//}
//
//class Child2 extends Parent
//{
//    public void work() throws IOException
//    {
//        System.out.println("Child 2 also works hard");
//    }
//
//}



//class Parent
//{
//    public void work() throws ArithmeticException
//    {
//        System.out.println("Parents works hard");
//    }
//}
//
//class Child1 extends Parent
//{
//    public void work() throws ArithmeticException
//    {
//        System.out.println("Child 1 also works hard");
//    }
//}
//
//class Child2 extends Parent
//{
//    public void work()
//    {
//        System.out.println("Child 2 also works hard");
//    }
//}
//
//class Child3 extends Parent
//{
//    public void work() throws IOException
//    {
//        System.out.println("Child 3 also works hard");
//    }
//}


class Parent
{
    public void work() throws IOException
    {
        System.out.println("Parents works hard");
    }
}

class Child1 extends Parent
{
    public void work() throws ArithmeticException
    {
        System.out.println("Child 1 also works hard");
    }
}

class Child2 extends Parent
{
    public void work()
    {
        System.out.println("Child 2 also works hard");
    }
}

class Child3 extends Parent
{
    public void work() throws IOException
    {
        System.out.println("Child 3 also works hard");
    }
}

//class Child4 extends Parent
//{
//    public void work() throws Exception   // Partial Exception
//    {
//        System.out.println("Child 4 also works hard");
//    }
//}



public class LaunchEH10
{
    public static void main(String[] args)
    {


    }
}
