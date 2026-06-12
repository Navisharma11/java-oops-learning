class Calc1
{
    int n1,n2,res;

//    void add(){
//        n1=10;
//        n2=20;
//        res=n1+n2;
//        System.out.println("Adding 10 and 20 gives us " + res);
//    }


//    int add(){
//        n1=10;
//        n2=20;
//        res=n1+n2;
//       return res;
//    }


//        void add(int a,int b){
//        n1=a;
//        n2=b;
//        res=n1+n2;
//        System.out.println("Adding " +a+ " and " +b+ " gives us " + res);
//    }


    int add(int a,int b){
        n1=a;
        n2=b;
        res=n1+n2;
        return res;
    }
}



public class Methods1
{
    public static void main(String[] args)
    {
        Calc1 calc = new Calc1();
//        calc.add();
//        int ans = calc.add();
//        System.out.println("Adding 10 and 20 gives us " + ans);
//        calc.add(50,60); 
        int ans = calc.add(50,50);
        System.out.println(ans);

    }
}
