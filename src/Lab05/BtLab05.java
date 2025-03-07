package Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class BtLab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double>list = new ArrayList();
        while (true) {
            System.out.println("Nhap phan tu : ");
            double a = scanner.nextDouble();
            list.add(a);
            System.out.println("Nhap them Y/N");
            scanner.nextLine();
            String choice = scanner.nextLine();
            if( choice.equalsIgnoreCase("N")){
                break;
            }
        }
        double sum  = 0;
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        System.out.println("Tong cua cac phan tu trong Array list = " + sum);
        scanner.close();
    }
}
