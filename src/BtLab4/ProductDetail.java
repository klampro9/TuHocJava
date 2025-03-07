package BtLab4;

public class ProductDetail {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr1 = test.nhapThongTin("Computer", 200, 0.02);
        test.xuatThongTin(pr1);
        System.out.println("Tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
        
    }
}
