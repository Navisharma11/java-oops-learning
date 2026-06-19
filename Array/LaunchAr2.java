import java.util.Objects;
import java.util.Scanner;

public class LaunchAr2
{
    public static void main(String[] args)
    {
//        int [][]marks = new int[3][4];
        int [][]marks = new int[3][];
        marks[0] = new int[4];
        marks[1] = new int[2];
        marks[2] = new int[3];
        Scanner scan = new Scanner(System.in);

        for(int i=0;i< marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("Kindly enter marks of class "+ i + " Student " + j);
                marks[i][j] = scan.nextInt();
            }
        }

        System.out.println("Marks stored in an array");

        for(int i=0;i< marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }


//        int []arr = {1,2,3};

//        Object ar[] = new Objects[3];
//        ar[0] = 4;
//        ar[1] = "Navi";
//        ar[2] = 45.5;
    }

}
