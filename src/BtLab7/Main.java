package BtLab7;

public class Main {
    public static void main(String[] args) {
        System.out.println("run bt lab 7");
       Sinhvien stIT = new SinhVienIT(5, 7);
       Sinhvien stCoKhi = new SinhVienCoKhi(9, 8.5);
       System.out.println("Diem cua sinh vien IT: " + stIT.getDiem());
       System.out.println("Diem cua sinh vien Co khi: " + stCoKhi.getDiem());
    }
}
