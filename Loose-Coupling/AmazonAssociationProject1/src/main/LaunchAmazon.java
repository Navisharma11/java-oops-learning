package main;

import services.BlueDart;
import services.FedEx;
import services.FirstFlight;

public class LaunchAmazon
{

    public static void main(String[] args)
    {
        // Constructor Injection
        Amazon amz = new Amazon(new FirstFlight());

        // Bean -> If object is created by spring

        // Injecting dependent object/dependency into target class is called as dependency injection
        // If this is done through setter we call as setter injection
        // If this is done through constructor its called as constructor injection

        // target class/object ==> a class where services of other classes are being used
        // eg in this project ==>  amazon class

        // dependent object class ==> a class whose services will be used in target class
        // eg in this project ==> FirstFlight, FedEx, BlueDart


//        FedEx fedex = new FedEx();
//        amz.setService(fedex);

        // Setter Injection
//        amz.setService(new FedEx());
//        amz.setService(new BlueDart());

        Boolean status = amz.deliverTheProduct(4545.4);
        if(status){
            System.out.println("Product Delivery Successfull");
        }
        else{
            System.out.println("Failed to Deliver Product");
        }

    }

}
