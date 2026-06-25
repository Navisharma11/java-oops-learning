class Animal
{
    public void animalUsuallyHuntsAndEat()
    {
        System.out.println("Animal is eating....");
 }
}

//@Override
class Tiger extends Animal
{
    //overriding parent class method to suite child requirement
    @Override
    public void animalUsuallyHuntsAndEat()
    {
        System.out.println("Tiger hunts and eat.....");
    }
}



public class LaunchAnnotation1
{
    public static void main(String[] args)
    {
        Tiger t = new Tiger();
        t.animalUsuallyHuntsAndEat();
    }
}
