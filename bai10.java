import java.util.Scanner;
class mang3
{
    static Scanner sc=new Scanner(System.in);
    static int []arr;
    static int spt;
     void nhap()
    {
        System.out.println("Nhap so luong pt: ");
       spt=sc.nextInt();
       arr=new int[spt+2];
       for(int i=0;i<spt;i++)
       {
            System.out.println("arr["+i+"]: ");
            arr[i]=sc.nextInt();
       }     
    }
    void xuat()
    {
        System.out.println("Xuat mang: ");
        for(int i=0;i<spt;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
   void xoa()
    {
        int x;
        System.out.println("\nNhap vi tri can xoa(0->n-1)");
        x=sc.nextInt();
            if(x==0)
            {
                for(int i=0;i<spt-1;i++)
                {
                    arr[i]=arr[i+1];
                }
                spt--;
            }
            else 
                {
                    if(x==spt-1)
                    {
                        spt--;
                    }
                    else
                    {
                        for(int i=x;i<spt-1;i++)
                        {
                            arr[i]=arr[i+1];
                        }
                        spt--;
                        
                    }
                }
    }
    void chen()
    {
        int x;
        int vt;
        System.out.println("Nhap index can chen: ");
        x=sc.nextInt();
        System.out.println("Nhap vt can chen(0->n-1): ");
        vt=sc.nextInt();
        spt++;
        for(int i=spt-1;i>vt;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[vt]=x;
    }
}
public class bai10 {
    public static void main(String []args)
    {
        mang3 arr3=new mang3();
        arr3.nhap();
        arr3.xuat();
        arr3.chen();
        arr3.xuat();
        arr3.xoa();
        arr3.xuat();
    }
}
