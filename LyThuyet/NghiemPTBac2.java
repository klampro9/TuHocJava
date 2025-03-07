import java.util.Scanner;
public class NghiemPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a =");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b =");
        int b = scanner.nextInt();
        if( a== 0 && b == 0){
            System.out.println("Phuong trinh vo co vo so nghiem");
        } else if( a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem");
        } else{
            float x = (float) -b/a;
            System.out.println("Nghiem cua phuong trinh =" + x);
        }
        scanner.close();
    }
}
