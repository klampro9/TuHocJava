package BtLab9;

public class SinhVien {
    private int masv;
    private String name;
    private double diem;
    private int age;
    
    public SinhVien(int masv, String name, double diem, int age) {
        this.masv = masv;
        this.name = name;
        this.diem = diem;
        this.age = age;
    }
    public int getMasv() {
        return masv;
    }
    public void setMasv(int masv) {
        this.masv = masv;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "SinhVien [masv=" + masv + ", name=" + name + ", diem=" + diem + ", age=" + age + "]";
    }
    
}
