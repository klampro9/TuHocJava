Mục tiêu:
    - Tạo một class hoàn chỉnh
    - Biết cách sử dụng object (instance từ class đã tạo)
Yêu cầu
Tạo class Product gôm các thuộc tính:
    - name: String // tên sản phẩm
    - price: double // giá sản phẩm
    - tax // thuế sản phẩm
Bài 1:
    - Tạo class với yêu cầu ở trên, đặt tên là Product.java
    - Tạo thêm 2 method cho class ở trên:
        + nhapThongTin(): void (dùng để nhập thông tin object)
        + xuatThongTin(): void (in ra thông tin object đã tạo)
        + getTaxPrice(): double (số tiền thuế  = price * tax)
Bài 2: kế thừa bài 1 và bổ sung thêm:
    - trong hàm main, tạo 2 object Products và in ra thông tin ra màn hình
==> sử dụng constructor
Bài 3: kế thừa bài 2 và bổ sung thêm:
    - getter/setter
    - sử dụng keyword private
