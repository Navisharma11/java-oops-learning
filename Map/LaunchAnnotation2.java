import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,
        ElementType.FIELD,ElementType.METHOD})
@interface CricketPlayer
{
    String country() default "India";
    int age() default 34;
    
}//@ this specifies compiler that annotation type is being created


//Virat Kohli is a cricket player who lived in india and play for india this class is for him
//@CricketPlayer(country = "India", age = 35)
@CricketPlayer(country = "India", age = 34)
class ViratKohl
{
    @CricketPlayer
    private int innings;
    @CricketPlayer
    public ViratKohl()
    {

    }
    @CricketPlayer
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

}


public class LaunchAnnotation2
{
    public static void main(String[] args)
    {
        ViratKohl vk = new ViratKohl();
        vk.setInnings(344);
        System.out.println(vk.getInnings());

        System.out.println("**************************");

        Class<? extends ViratKohl> c = vk.getClass();
        Annotation an = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)an;
        int age = cp.age();
        String co = cp.country();
        System.out.println("Info of attributes of annotations " + age + " " + co);

    }
}
