package chapter9;
import java.util.Scanner;
public class Video52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //     while (true) { 
    //         System.out.print("Nhap x = ");
    //     try {
    //         int x = scanner.nextInt();
    //         try {
    //             System.out.println("Ket qua 10/" + x + " = " + 10/x);
    //             break;
    //         } catch (Exception e) {
    //             System.out.println("run x =" + x);
    //         }
    //     } catch (Exception e) {
    //         scanner.next();
    //         System.out.println("run error");
    //     }
    // }
    //     scanner.close();
        try {
            int x = scanner.nextInt();
            System.out.println("run try");
        } catch (Exception e) {
            System.out.println("Run catch");
        } finally {
            System.out.println("run finally");
            scanner.close();
        }
    }
}
