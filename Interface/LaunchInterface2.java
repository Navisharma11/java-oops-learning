//interface Demo1
//{
//    void disp();
//}
//
//interface Demo2 implements Demo1     // not possible
//{
//
//}

interface Beta
{

}


interface Demo1
{
    void disp();
    float pi = 3.14f;  // behind the scene it is considered as this --> public static final float pi = 3.14f;
}

interface Demo2
{
//    Demo()  // Illogical
//    {
//
//    }


    void disp();
}



//interface Demo2 extends  Demo1         // no problem interface can extend one more interface
//{
//    void show();
//}

class Alpha implements Demo2, Demo1
{
    public void disp() {
         System.out.println("Focus is the key");
    }

}



public class LaunchInterface2
{
    public static void main(String[] args)
    {
//        Demo1 d1 = new src.Alpha();
//        d1.disp();

//        Demo2 d2 = new src.Alpha();
//        d2.disp();
//        d2.show();

//        Demo1.pi=4.5f;   its final and static

    }
}
