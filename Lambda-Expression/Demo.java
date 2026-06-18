//class Person
//{
//    public void printName(){
//        System.out.println("Suresh");
//    }
//
//     class Phone
//    {
//        public void details(){
//            System.out.println("Vivo");
//        }
//    }
//}


class A{
    public void show(){
        System.out.println("in A show");
    }

    public void display(){
        System.out.println("in display");
    }
}


class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}



public class Demo
{

    public static void main(String[] args) {

        A obj = new A(){                // Anonymous inner class
            public void show(){
                System.out.println("in new show");
            }

            public void display(){
                System.out.println("in new display");
            }

            public void getData(){
                System.out.println("new data");
            }
        };

        obj.show();
        obj.display();


        new A(){                // Anonymous inner class
            public void show(){
                System.out.println("in new show");
            }

            public void display(){
                System.out.println("in new display");
            }

            public void getData(){
                System.out.println("new data");
            }
        }.getData();


        new B().show();

//        Person obj = new Person();
//        obj.printName();
//        Person.Phone obj1 = obj.new Phone();
//        obj1.details();

    }

}
