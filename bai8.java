import java.util.Scanner;
class mang1
{
    static int []arr;
    static int [][]arr1;
    static int dem=0;
    static int spt;

    static Scanner sc=new Scanner(System.in);
    public void nhap ()
    {
        System.out.println("Nhap so phan tu: ");
        spt=sc.nextInt();
        arr=new int [spt];
        arr1=new int [spt][2];
        for(int i=0;i<spt;i++)
        {
            System.out.println("Nhap arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
    }
    public void xuat ()
    {
      System.out.println("Mang arr: ");
      for(int i=0;i<spt;i++)
      {
        System.out.print(arr[i]+" ");
      }
    }
    public int timkiem(int a)
    {
        for(int i=0;i<dem;i++)
          if(arr1[i][0]==a)
               return i;
         return -1;
    }
    public int xuathien()
    {
       for(int i=0;i<spt;i++)
       { 
           int vt=timkiem(arr[i]);
           if(vt==-1)
          {
            if(dem==0)
            {
            arr1[dem][0]=arr[i];
            arr1[dem][1]=1;
            dem++;
            }
            else
            {
               arr1[dem][0]=arr[i];
               arr1[dem][1]=1;
              dem++;
              }
        }
          else
          {
            arr1[vt][1]+=1;
          }
       }
       int max=arr1[0][0];
       int gtmax=arr1[0][1];
       for(int i=1;i<dem;i++)
       {
        if(arr1[i][1]>gtmax)
        {
            gtmax=arr1[i][1];
            max=arr1[i][0];
        }
       }
       return max;
    }
}
public class bai8 {
    public static void main(String []args)
    {
        mang1 array=new mang1();
         array.nhap();
         array.xuat();
         int i;
        i=array.xuathien();
         System.out.println("Phan tu xuat hien nhieu nhat trong mang la: "+i);
        
    }
}
