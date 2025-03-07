package BtString;

import java.util.Scanner;

public class BtString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("User name: ");
        String userName = scanner.nextLine();
        System.out.printf("Password: ");
        String passWord = scanner.nextLine();
        if( userName.equals("hoidanit") && passWord.length() > 6){
            System.out.println("Hop le");
        } else{
            System.out.println("Khong hop le");
        }
        scanner.close();
    }
}
