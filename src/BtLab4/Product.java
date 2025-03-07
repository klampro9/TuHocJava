package BtLab4;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product(String name, double price, double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    public Product(){
    
    }
    public void setName(String name1){
        this.name = name;
    }
    public void setTax(double tax1){
        this.tax = tax1;
    }
    public void setPrice(double price1){
        this.price = price1;
    }

    public String getName(){
        return this.name;
    }
    public double getTax(){
        return this.tax;
    }
    public double getPrice(){
        return this.price;
    }
    public double getTaxPrice(double price, double tax){
        return price * tax;
    }
    public Product nhapThongTin(String name1, double price1, double tax1){
        Product pr = new Product(name1, price1, tax1);
        return pr;
    }
    public void xuatThongTin(Product pr){
        System.out.println("Name:" + pr.getName());
        System.out.println("Price:" + pr.getPrice());
        System.out.println("Tax:" + pr.getTax());
    }
}
