import java.util.Arrays;
import java.util.Scanner;
public class KiemTraMangSoNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of element for Array");
        int size  = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i< a.length; i++){
            System.out.println("Input element " + i +" = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Array after input elemenet = " + Arrays.toString(a));
        int count = 0;
        for ( int i = 2; i< a.length; i++){
            for( int j = i +1; i< a[i]; j++){
                if(a[i] % j == 0){
                    count++;
                    break;
                }
            }   
        }
        if(count>1){
            System.out.println("Mang nay khong phai la mang toan so nguyen to");
        } else {
            System.out.println("Mang nay toan so nguyen to");
        }

    }
}
