import java.util.Scanner;
class mang
{
    static int []arr;
    static int spt;
    static Scanner sc=new Scanner(System.in);
    void nhap ()
    {
        System.out.println("Nhap so phan tu: ");
        spt=sc.nextInt();
        arr=new int [spt];
        for(int i=0;i<spt;i++)
        {
            System.out.println("Nhap arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
    }
    void xuat ()
    {
      System.out.println("Mang arr: ");
      for(int i=0;i<spt;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
    int tong(int []arr,int spt)
    {
        if(spt>0)
           return arr[spt-1]+tong(arr,spt-1);
        else return 0;
    }
}
public class bai7 {
    public static void main(String []args)
    {
        mang array=new mang();
         array.nhap();
         array.xuat();
         System.out.println("Tong mang la: "+array.tong(array.arr,array.spt));
    }
}
