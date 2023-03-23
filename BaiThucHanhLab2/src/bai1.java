import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhat: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        int tong = a + b;
        System.out.println( a +"+"+b+"="+tong);
        int hieu = a-b;
        System.out.println(a+"-"+b+"="+hieu);
        int tich = a*b;
        System.out.println(a+"*"+b+"="+tich);
        float thuong = a/b;
        System.out.println(a+"/"+b+"="+thuong);
        int phandu =a%b;
        System.out.println(a + " % " + b + " = " + phandu);
        System.out.println("ket qua so sanh bang 2 so"+a+ "va"+b+ "la"+(a==b));
        System.out.println("ket qua so sanh khong bang 2 so"+a+ "va"+b+ "la"+(a!=b));
        System.out.println("ket qua so sanh lon hon 2 so"+a+ "va"+b+ "la"+(a>b));
        System.out.println("ket qua so sanh lon hon hoac bang 2 so"+a+ "va"+b+ "la"+(a>=b));
        System.out.println("ket qua so sanh nho hon 2 so"+a+ "va"+b+ "la"+(a<b));
        System.out.println("ket qua so sanh nho hon hoac bang 2 so" +a+ "va" +b+ "la"+(a<=b));
       


    }  
}
    
