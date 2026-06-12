class Mul
{
//    int mul(int x,int y)
//    {
//        return x*y;
//    }

//    void mul(int a,int b)
//    {
//        int res = a*b;
//    }


    double mul(int x,int y,double z)
    {
        System.out.println("2 int 1 double");
         return x*y*z;
    }


    double mul(double x,double y,double z)
    {
        System.out.println("3 double");
        return x*y*z;
    }


    double mul(int x,double y)
    {
        return x*y;
    }


    double mul(double x,double y)
    {
        return x*y;
    }

}



public class LaunchMo2
{
    public static void main(String[] args)
    {
        Mul m = new Mul();
         System.out.println(m.mul(4,4));
         System.out.println(m.mul(4,4,4));
         System.out.println(m.mul(44,44,44));
    }
}
