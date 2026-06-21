class Alien
{
    public void alpha()
    {
        beta();
    }
    public void beta()
    {
        alpha();
    }
}

//  STACK OVERFLOW ERROR


public class LaunchEH8
{
    public static void main(String[] args)
    {
        Alien a = new Alien();
        a.beta();

    }
}
