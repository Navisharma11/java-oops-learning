class Telusko
{
    private String courseName;
    private int courseCost;
    private String city;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(int courseCost) {
        this.courseCost = courseCost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Telusko(String courseName, int courseCost, String city) {
        super();
        this.courseName = courseName;
        this.courseCost = courseCost;
        this.city = city;
    }

    public Telusko() {
        super();
    }

    @Override
    public String toString(){
        return "Telusko [courseName=" + courseName +", courseCost=" + courseCost + ", city=" + city + "]";
    }
}


public class Launch
{
    public static void main(String[] args)
    {
        Telusko t = new Telusko("SB",3000,"Bengaluru");
        System.out.println(t);
//        System.out.println(t.getCourseName());
//        System.out.println(t.getCourseCost());
//        System.out.println(t.getCity());

    }
}
