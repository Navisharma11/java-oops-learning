package main;

import service.Java;
import service.SpringBoot;

public class LaunchApp
{

    public static void main(String[] args)
    {
        Telusko telusko = new Telusko(new Java());

        telusko.setCourse(new SpringBoot());

        Boolean status = telusko.buyTheCouse(2500.0);

        if(status){
            System.out.println("Course Purchased Succcessfully");
        }
        else
        {
            System.out.println("Failed to buy the course");
        }
    }

}
