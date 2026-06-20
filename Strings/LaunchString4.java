public class LaunchString4
{
    public static void main(String[] args)
    {
//        final String s1 = "Telusko";
//        s1 = s1 + "Java";


//        final String s1 = "Telusko";
//        String s2 = s1 + " Java";
//        System.out.println(s2);



        //compareTo()
//        String s1 = "SACHIN";
//        String s2 = "SACHIN";
//        String s1 = "VIRAT";
//        String s2 = "DHONI";
        String s1 = "SAURAV";
        String s2 = "SEHWAG";
        int res = s1.compareTo(s2);
        System.out.println(res);

        if(res==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
