import java.util.Scanner;
public class bai6 {
    static int ucln(int a,int b)
    {
        a=Math.abs(a);
        b=Math.abs(b); 
        if(a==0) return b;
        if(b==0) return a;  
        while(a%b!=0)
        {
            int r;
            r=a%b;
            a=b;
            b=r;
        }
        return b;
    }
    static int bcnn(int a,int b)
    {

        int x=ucln(a,b);
        return Math.abs(a*b)/x;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Nhap a, b: ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("UCLN cua "+x+" va "+y+": "+ucln(x,y));
        System.out.println("BCNN cua "+x+" va "+y+": "+bcnn(x,y));
    }
}
