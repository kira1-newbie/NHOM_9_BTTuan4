 vinh
import java.util.Scanner;

public class bai5.1{
	static boolean kt(int a) {
		if(a<2) return false;
		for (int i = 2; i <= Math.sqrt(a); i++) { 
            if (a % i == 0) return false; 
        }
        return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 so nguyen duong");
		int a=sc.nextInt();
		if (kt(a)) {
		    System.out.println(a + " là số nguyên tố.");
		} else {
		    System.out.println(a + " không phải là số nguyên tố.");
		}
		sc.close();

	}
	
}
import java.util.Scanner;
public class bai5.1 {
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
main
