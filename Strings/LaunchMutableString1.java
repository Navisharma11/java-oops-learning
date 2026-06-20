public class LaunchMutableString1
{
    public static void main(String[] args)
    {
//        StringBuffer s = "Telusko";    CE (Not Allowed)
//         StringBuffer sb1 = new StringBuffer("Telukso");
        StringBuilder sb1 = new StringBuilder("Telukso");
         System.out.println(sb1);
         sb1.append(" Alien");
         System.out.println(sb1);
         sb1.append(45.2);
         sb1.append(true);
         System.out.println(sb1);

    }

}
