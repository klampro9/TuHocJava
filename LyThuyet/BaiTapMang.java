import java.util.Arrays;
import java.util.Scanner;
public class BaiTapMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao so luong phan tu cua mang = ");
        int size  = scanner.nextInt();
        int[] a= new int[size];
        for( int i = 0; i<a.length;i++){
            System.out.println("phan tu " + i);
            a[i] = scanner.nextInt();
        }
        System.out.println("Mang sau khi nhap  = " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep  = " + Arrays.toString(a));
        System.out.println("Gia tri nho nhat cua mang = " + a[0]);
        System.out.println("gia tri lon nhat cua mang  = " + a[a.length -1]);

    }
}
