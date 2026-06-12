import javax.annotation.processing.SupportedSourceVersion;

class Demo
{
    int num1,num2;

    Demo()
    {
        super();
        System.out.println("Zero param constructor");
    }

    Demo(int num1,int num2)
    {
        this(num1);
        this.num1=num1;
        this.num2=num2;
        System.out.println("2 param constructor");
    }

    Demo(int num1)
    {
        this();
        this.num1=num1;
        num2=44;
        System.out.println("1 param constructor");
    }

    void disp()
    {
        System.out.println("num1 :"+num1);
        System.out.println("num2 :"+num2);
    }
}



public class LaunchConstructor2
{
    public static void main(String[] args)
    {
        Demo demo1 = new Demo(4);
        demo1.disp();
        System.out.println("*******************************");

        Demo demo2 = new Demo(4,5);
        demo2.disp();

    }
}
