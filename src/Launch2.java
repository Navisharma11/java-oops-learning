class Calc
{
      int num1;
      int num2;
      int o;

      void add(){
          num1 = 10;
          num2 = 20;
          int res = num1+num2;
          System.out.println(res);
      }

      void sub(){
//          int n;
          int res = num1-num2;
          System.out.println(res);
//          System.out.println(n);
          System.out.println(o);
      }

}


public class Launch2
{
    public static void main(String[] args)
    {
          Calc c = new Calc();
          c.add();
          c.sub();

          for(int i=0;i<4;i++){
              System.out.println(i);
          }
    }
}
