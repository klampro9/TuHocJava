import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        /*
            // * DƯới 10m : không đóng thuế.
            // * 10m tới 15m: thuế 10%.
            // * 15m tới 30m: thuế 20%.
            // * Trên 30m: thuế 50%.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao luong =");
        int tax = scanner.nextInt();
        if( tax  < 10){
            System.out.println("Khong phai dong tax");
        } else if( tax > 10 && tax < 15){
            System.out.println("tax 10%");
        } else if (tax > 15 && tax < 30){
            System.out.println("tax 20%");
        } else {
            System.out.println("tax 50%");
        }
        scanner.close();
    }
}
