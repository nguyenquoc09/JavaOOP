package baithuchanh;

import java.util.Scanner;

public class Silde30 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("moi nhap n : ");
		n=sc.nextInt();
		int s=0;
		while (n>0) {
			s=s+(n%10);
			n=n/10;
	}
		System.out.println("tong cac chu so la : " + s);

	}
}