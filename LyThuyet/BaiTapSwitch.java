// Nhập vào 1 số trả ra ngày tương ứng
import java.util.Scanner;
public class BaiTapSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Exit");
        System.out.println("Choice your option");   
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("You have selected the addition operation");
                break;
            case 2:
                System.out.println("You have selected the subtraction operation");
                break;
            default:
                System.exit(0);
        };
        int option1 = scanner.nextInt();
        scanner.close();
        // System.out.printf("Nhap vao ngay = ");
        // int day = scanner.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Webnesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Sartuday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //     System.out.println("Dont know");
        // }
    
    }
}
