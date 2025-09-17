import java.util.Scanner;
public class bai1 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Nhap x: ");
        x=sc.nextInt();
        if(x==0)
        {
            System.out.println("La so bang 0");
        }
        else
            {
                if(x>0)
                    System.out.println("La so duong!");
                else 
                    System.out.println("La so am!");
            }
    }
}
