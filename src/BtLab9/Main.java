package BtLab9;

import BtLab7.Sinhvien;
import java.util.Scanner;

public class Main {

    public static int NhapMasv(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.print("Nhap ma so sinh vien: ");
            try {
                result = scanner.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Ma so sinh vien khong hop le");
                scanner.next();
            }
        }
        scanner.close();
        return result;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int masv = NhapMasv();
            SinhVien sv = new SinhVien(masv, "Lam", 8.5, 18);
            System.out.println(sv);
        };

    }
}
