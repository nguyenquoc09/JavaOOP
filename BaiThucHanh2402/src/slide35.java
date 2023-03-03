package baithuchanh;

import java.util.Scanner;

public class Slide35 {
	public static void main(String[] args) {
		int  a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("moi nhap 2 so a va b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("so be nhat trong 2 so la : " + Math.min(a,b));
	}

}