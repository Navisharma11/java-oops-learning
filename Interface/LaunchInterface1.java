import javax.annotation.processing.SupportedSourceVersion;

interface Calc
{
     void add(int a,int b); // public astract void add(int a,int b);
     public abstract void sub(int a,int b);
}

interface Calc2
{
    int mul(int a,int b);
    int div(int a,int b);
}

class Calculator
{
    public void disp()
    {
        System.out.println("Calculator Class");
    }
}

class MyCalc1 extends Calculator implements Calc, Calc2
{
    public void add(int a,int b)
    {
        int res = a+b;
        System.out.println("The res is " + res);

    }

    public void sub(int a, int b)
    {
        int res = a-b;
        System.out.println("The res is " + res);
    }

    public int mul(int a,int b)
    {
        return a*b;
    }

    public int div(int a,int b)
    {
        return a/b;
    }
}


class MyCalc2 implements Calc, Calc2
{
    public void add(int a,int b)
    {
        int n1 = a;
        int n2 = b;
        int res = n1+n2;
        System.out.println("The res is " + res);

    }

    public void sub(int a, int b)
    {
        int n1 = a;
        int n2 = b;
        int res = n1-n2;
        System.out.println("The res is " + res);
    }

    public int mul(int a,int b)
    {
        return a*b;
    }

    public int div(int a,int b)
    {
        return a/b;
    }
}



class MyCalc3 implements Calc, Calc2
{
    public void add(int a,int b)
    {
        if(a>0 && b>0) {
            int res = a + b;
            System.out.println("The res is " + res);
        }
        else{
            System.out.println("Let the number be non zero");
        }
    }

    public void sub(int a, int b)
    {
        if(a>0 && b>0) {
            int res = a - b;
            System.out.println("The res is " + res);
        }
        else{
            System.out.println("Let the number be non zero");
        }
    }

    public int mul(int a,int b)
    {
        if(a>0 && b>0) {
            int res = a * b;
           return res;
        }
        else{
            return 0;
        }
    }

    public int div(int a,int b)
    {
        if(a>0 && b>0) {
            int res = a / b;
            return res;
        }
        else{
           return 0;
        }
    }
}



//class Algebra
//{
//    public void cal(Calc c,int a,int b)
//    {
//         c.add(a, b);
//         c.sub(a, b);
//    }
//}


public class LaunchInterface1
{
    public static void main(String args[])
    {
//        MyCalc1 cal1 = new MyCalc1();
//
//        MyCalc2 cal2 = new MyCalc2();
//
//        MyCalc3 cal3 = new MyCalc3();
//
//        Algebra a = new Algebra();
//
//        a.cal(cal1,10,20);
//        a.cal(cal2,5,4);
//        a.cal(cal3,5,5);


      //  Calc c = new Calc();   // We can't create the object of an interface



        MyCalc1 cal1 = new MyCalc1();
        cal1.add(2,3);
        cal1.sub(4,5);
        System.out.println(cal1.mul(4,5));
        System.out.println(cal1.div(15,5));

        MyCalc2 cal2 = new MyCalc2();
        cal2.add(2,3);
        cal2.sub(4,5);
        System.out.println(cal2.mul(4,5));
        System.out.println(cal2.div(15,5));

        MyCalc3 cal3 = new MyCalc3();
        cal3.add(2,3);
        cal3.sub(4,5);
        System.out.println(cal3.mul(4,5));
        System.out.println(cal3.div(15,5));

    }
}
