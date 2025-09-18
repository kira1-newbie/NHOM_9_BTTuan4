import java.util.Scanner;
public class bai5 {
    static boolean snt(int a)
    {
        if(a==1) return false;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0) return false;
        }
        return true;
    }
    public static void main(String []args)
    {
           Scanner sc=new Scanner(System.in);
           int a;
           System.out.println("Nhap vao so nguyen: ");
           a=sc.nextInt();
           if(snt(a)!=true)
           {
            System.out.println("Khong phai so nguyen to");
           }
           else 
           System.out.println("La so nguyen to");
    }
}
