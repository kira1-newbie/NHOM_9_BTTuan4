import java.util.Scanner;

public class bai2 {
    public static void main(String []args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int a,b,c;
            System.out.println("Nhap a, b, c: ");
            a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
            int min=a;
            if(min>b||min>c)
            {
                if(b>c)
                {
                    min=c;
                }
                else 
                {
                    min=b;
                }
            }
            System.out.println("So nho nhat la: "+min);
        }
    }
}
