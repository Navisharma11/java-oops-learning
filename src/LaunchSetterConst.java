class Finishers
{
    private int id;
    private String name;
    private String city;

    public Finishers()
    {
        super();
        System.out.println("Zero param constructor");
    }

    public Finishers(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        System.out.println("Param constructor");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


public class LaunchSetterConst
{
    public static void main(String[] args)
    {
        Finishers f1 = new Finishers();
        f1.setId(1);
        f1.setName("Chaitanya Sally");
        f1.setCity("Bharatpur");
        System.out.println(f1.getId());
        System.out.println(f1.getName());
        System.out.println(f1.getCity());

        System.out.println("**************************************");

        Finishers f2 = new Finishers(2,"Rohit","Mumbai");
        f2.setId(3);
        f2.setName("Virat");
        f2.setCity("Bengaluru");
        System.out.println(f2.getId());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());

        int n1= 10;
        int n2= 80;
        int n3= 30;
        int res = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(res);
    }

}
