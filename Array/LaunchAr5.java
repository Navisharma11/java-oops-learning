import java.util.Arrays;

//class Telusko
//{
//    String courseName;
//    int courseCost;
//    String city;
//}


public class LaunchAr5
{
    public static void main(String[] args)
    {
//        Telusko t = new Telusko();
//        System.out.println(t);
//        System.out.println(t.getClass().getName());
//
//        System.out.println("*************************************");
//     //   Tshaped t2 = new Tshaped();
//
//        int a[] = new int[4];
//        System.out.println(a);
//        System.out.println(a.getClass().getName());
//
//        int ar[][] = new int[4][2];
//        System.out.println(ar.getClass().getName());


        int array[] = {8,5,6,3};

        for(int elem:array){
            System.out.print(elem+" ");
        }
        System.out.println();

        System.out.println("***************************");

        Arrays.sort(array);

        for(int elem:array){
            System.out.print(elem+" ");
        }
        System.out.println();

    }
}
