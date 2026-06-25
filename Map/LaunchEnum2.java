import java.sql.PreparedStatement;

enum Result
{
    PASS, FAIL, NR;

    //public static final Result PASS = new Result();
    //public static final Result FAIL = new Result();
    //public static final Result NR = new Result();


//    enum Week
//    {
//        MON, TUE;
//    }

    int marks;
    Result(){
        System.out.println("Constructoe of Enum");
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    public int getMarks(){
        return marks;
}

}


public class LaunchEnum2
{
    public static void main(String[] args)
    {
//        Result result = Result.PASS;
//        result.setMarks(44);
//        System.out.println(result.getMarks());

        Result.PASS.setMarks(44);
        int marks = Result.PASS.getMarks();
        System.out.println(marks);

        int marks2 = Result.FAIL.getMarks();
        System.out.println(marks2);

    }
}
