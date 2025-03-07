package SinhVien;

public class SinhVienIT  extends SinhVien{
    private String language;
    public SinhVienIT(String language, String id, String name, double price, double tax){
        super(id, name, price, tax);
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void getMoney(){
        System.out.println("Run get Money");
        this.info();
    }
    
    public void info(){
        System.out.println("run info from children");
    }

    @Override
    void tinhDiem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
