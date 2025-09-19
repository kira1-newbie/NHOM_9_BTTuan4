import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("Nhap 2 so a va b:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("1.Cong 2 so");
		System.out.println("2.Tru 2 so");
		System.out.println("3.Nhan 2 so");
		System.out.println("4.Chia 2 so");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("a+b="+(a+b));
		}else if(choice ==2) {
			System.out.println("a-b="+(a-b));
		}else if(choice ==3) {
			System.out.println("a*b="+(a*b));
		}else if(choice ==4) {
			if (b != 0) {
                System.out.println("a / b = " + (a / b));
            } else {
                System.out.println("Không thể chia cho 0!");
            }
		}
		sc.close();

	}
}
