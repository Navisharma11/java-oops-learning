public class LaunchString1
{
    public static void main(String[] args)
    {
//        String str1 = "Telusko";
//        String str2 = "Telusko";
//        System.out.println(str1==str2);//true(comparing the reference)
//        System.out.println(str1.equals(str2));//tue(comparing the data)


//        String str1 = new String("Telusko");
//        String str2 = new String("Telusko");
//        System.out.println(str1==str2);//false(comparing the reference)
//        System.out.println(str1.equals(str2));//true(comparing the data)


//        String str1 = "Telusko";
//        String str2 = new String("Telusko");
//        System.out.println(str1.equals(str2));//true
//        System.out.println(str1==str2);//false


        String str1 = "Telusko";
        String str2 = "telusko";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1==str2);//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

    }
}
