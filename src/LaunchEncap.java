//Encapsulation
//
//Definition:
//
//Encapsulation is the process of giving controlled access to data members (instance variables) of a class by making them private and using getters and setters.
//
//Key Points:
//
//It is the process of binding data members and methods into a single unit.
//It provides security to important components (data members) by:
//Making them private
//Allowing access through setters and getters
//
//How to achieve Encapsulation:
//
//Use private keyword
//Use setter methods
//Use getter methods


class Book
{
    private int pageNum;

    // setter
    void setPageNum(int pgNo)
    {
        if(pgNo>=0)
        {
            pageNum = pgNo;
        }
        else
        {
            System.out.println("Kindly add non zero number");
        }
    }


    // getter
    int getPageNum()
    {
        return pageNum;
    }


    void display()
    {
        System.out.println("Java and Inheritance is present in pageNumber "+ pageNum);
    }
}



public class LaunchEncap
{
    public static void main(String[] args)
    {
        Book book = new Book();
      //  book.pageNum = 4;
        book.setPageNum(4);

        System.out.println(book.getPageNum());

      //  System.out.println(book.pageNum);
        book.display();
    }

}
