
enum Week
{
//    mon, tue, wed, thu, fri, sat, sun;
    MON, TUE, WED, THU, FRI, SAT, SUN;

}


public class LaunchEnum1
{
    public static void main(String[] args)
    {
        Week week = Week.MON;
        System.out.println(week);

        int index = Week.THU.ordinal();
        System.out.println(index);//3 --> index

        Week[] weekAr = Week.values();

        for(Week w:weekAr){
            System.out.println(w.ordinal() + " -> " + w);
        }
    }
}
