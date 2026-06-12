package src;

class Alpha1
{
    int a, b;

    public Alpha1()
    {
        a=10;
        b=20;
        System.out.println("Inheritance_package.src.Alpha zero param constructor");
    }

    public Alpha1(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Param Constructor of Inheritance_package.src.Alpha");
    }
}

class Beta1 extends Alpha1
{
    int x, y;

    public Beta1()
    {
        x=1;
        y=2;
        System.out.println("Inheritance_package.src.Beta zero param constructor");
    }

    public Beta1(int x,int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("Inheritance_package.src.Beta param constructor");
    }

    public void disp()
    {
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("x: "+x);
        System.out.println("y: "+y);

    }

}




public class LaunchInheritance7
{
    public static void main(String[] args)
    {
        Beta1 b = new Beta1(10,20);
        b.disp();

    }
}
