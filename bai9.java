import java.util.Scanner;

public class bai9 {
	static Scanner sc = new Scanner(System.in);

	static void nhap(int a[],int n) {
		for(int i=1;i<=n;i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			a[i]=sc.nextInt();
		}
	}
	static void in(int a[],int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Nhap spt");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		nhap(a, n);
		in(a,n);
		sc.close();
				
	}
}
