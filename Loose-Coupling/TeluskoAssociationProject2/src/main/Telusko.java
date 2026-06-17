package main;

import service.ICourse;

public class Telusko
{
    private ICourse course;

    public Telusko(ICourse course) {
        super();
        this.course = course;
    }

    public Telusko()
    {
        super();
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }


    public Boolean buyTheCouse(Double amount)
    {
        return course.getTheCourse(amount);
    }
}
