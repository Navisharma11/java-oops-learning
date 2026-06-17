package service;

public class Java implements ICourse
{
    @Override
    public boolean getTheCourse(Double amount)
    {
        System.out.println("Java Course purchased and the price paid is " + amount);
        return true;
    }
}
