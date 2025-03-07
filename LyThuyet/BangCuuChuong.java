import java.util.Arrays;
import java.util.Scanner;
public class BangCuuChuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao bang cuu chuong can in = ");
        int dauVao = scanner.nextInt();
        if( dauVao <=0){
            System.out.println("ban nhap sai moi nhap lai");
        } else{
            for (int i = 0; i <= 10; i++) {
                System.out.println(dauVao + " * " + i + " = " + dauVao*i);
            }
        }
    }
}
