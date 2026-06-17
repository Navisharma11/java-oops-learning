package services;

public class FirstFlight implements IDeliveryService
{

    @Override
    public Boolean deliverProduct(Double amount)
    {
        System.out.println("Product delivered through First Flight and amount paid is "+amount);
        return true;
    }
}
