package service;

public class SpringBoot implements ICourse
{
    @Override
    public boolean getTheCourse(Double amount) {
        System.out.println("SpringBoot Course purchased and the price paid is " + amount);
        return true;
    }
}
