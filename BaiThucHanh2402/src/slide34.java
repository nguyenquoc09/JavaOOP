package baithuchanh;

import java.util.Scanner;

public class Slide34 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("moi nhap he so a,b,c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	if(a==0) {
		if(b==0) {
			if(c==0) {
				System.out.println("pt co vo so nghiem");
			} else {
				System.out.println("pt vo nghiem");
			}
			} else {
				System.out.println("pt co nghiem la : " + (-c)/b);
		}
	} else
	{
		double DENTA = b*b-4*a*c;
		double denta = Math.sqrt(DENTA);
		double x1,x2;
		if(DENTA<0) {
			System.out.println("pt vo nghiem");
		} else if (DENTA==0) {
			x1=x2=(-b)/(2*a);
			System.out.println("pt co nghiem kep la : " + x1);
		} else {
			x1=(-b + denta)/(2*a);
			x2=(-b - denta)/(2*a);
			System.out.println("pt co 2 nghiem  la : " + x1 + " va " + x2);
		}
		}
	}

}