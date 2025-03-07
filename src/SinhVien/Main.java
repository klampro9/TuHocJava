package SinhVien;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Bai tap tinh ke thua ");
        SinhVienIT st1 = new SinhVienIT("Java", "1", "Lam", 10, 0.02);
        SinhVienCoKhi st2 = new SinhVienCoKhi("han", "2", "Quang", 20, 0.05);
        System.out.println(st1.name);
        System.out.println(st2.name);
    }
}
