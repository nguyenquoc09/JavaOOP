import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int tuoi,nam;
        String ten, nhomtuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        nam = scanner.nextInt();
        tuoi = 2023 - nam;
        if (tuoi < 16){
            nhomtuoi="ở độ tuổi vị thành niên";
        }
        else if (tuoi >= 16 || tuoi < 18){
            nhomtuoi = " ở độ tuổi trưởng thành";
        }else{
            nhomtuoi="đã già";
        }
System.out.println("bạn"+ten+"thuộc nhóm"+nhomtuoi);
    }
}

        

    

