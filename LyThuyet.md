OOP có 4 tính chất:
    1.Tính đóng gói (Encapsulation)
        Định nghĩa: Đóng gói dữ liệu và các phương thức liên quan vào trong một lớp. Hạn chế truy cập trực tiếp vào dữ liệu bên trong.
Cách thực hiện: Sử dụng các modifiers (private, protected, public) và các getter/setter.
public class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
    2.Tính kế thừa (Inheritance)
        Định nghĩa: Một lớp có thể kế thừa thuộc tính và phương thức từ một lớp khác giúp tái sử dụng mã nguồn và mở rộng chức năng.
Cách thực hiện: Dùng từ khóa extends.
class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Kế thừa từ Animal
        dog.bark();      // Phương thức riêng của Dog
    }
}
    3.Tính đa hình (Polymorphism)
        Cách thực hiện:
            + Ghi đè (Override): Khi lớp con cung cấp cách triển khai khác cho phương thức của lớp cha.
            + Nạp chồng (Overload): Khi một lớp có nhiều phương thức cùng tên nhưng khác tham số.
        * đa hình động
        class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Woof! Woof!
    }
}
    *Đa hình tĩnh:
    class MathUtil {
    // Overload phương thức add
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtil math = new MathUtil();
        System.out.println(math.add(2, 3));      // Output: 5
        System.out.println(math.add(2, 3, 4));   // Output: 9
    }
}
    4.Tính trừu tượng (Abstraction)
    Định nghĩa: Ẩn đi các chi tiết triển khai không cần thiết và chỉ hiển thị những gì quan trọng. Có thể thực hiện bằng lớp trừu tượng (abstract class) hoặc interface.
    Cách thực hiện:
        + Lớp trừu tượng (abstract): Chứa các phương thức abstract (chưa có triển khai) và phương thức bình thường.
        + Interface: Chỉ chứa phương thức abstract và mặc định các phương thức này là public abstract.
    * abstract:
        abstract class Animal {
    abstract void makeSound(); // Phương thức trừu tượng
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Woof! Woof!
    }
}
    * interface:
    interface Animal {
    void makeSound(); // Mặc định là public abstract
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Woof! Woof!
    }
}
=======================================================================================================================================

1.Khái niệm package: package === folder
=> Sử dụng để gom nhóm file lại với nhau => gọn gàng, dễ dàng tái sử dụng
=> import: dùng để tái sử dụng các class đã định định nghĩa trong các package
2. Access modifier: Quyền truy cập sửa đổi
    - private: chỉ sử dụng trong nội bộ class
    - public: công khai hoàn toàn (100%)
    =>(default): là public đối với class trong cùng package, là private nếu khác package
    -protected: được sử dụng với lớp cha/con (tính chất kế thừa).
    => public/ private là 2 thuộc tính được sử dụng nhiều nhất.
    Mức độ che dấu tăng dần:
    public --> protected --> default --> private
Auto boxing và unboxing
"Boxing": convert từ primitive value (giá trị nguyên thủy) => chuyển thành object
(wrapper class)
"unboxing": là quá trình ngược lại, từ object => giá trị nguyên thủy
=> Công việc Boxing/Unboxing do compiler "tự động làm"
(nên gọi là autoboxing/unboxing :v)
Ví dụ:
https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
Array List: không khai báo type (auto boxing, compiler tự động convert từ int sang Integer)
    + Các method hay dùng trong Array List: 
        * Đếm số lượng phần tử : size()
        * lấy ra phần tử của mảng: get(int index)
        * xóa phần tử: remove(int index)
Java Generics
#39. Regular Expression
Có bao giờ bạn thắc mắc, khi đăng ký tài khoản Gmail, bạn nhập:
abc@gmail.com => tên hợp lệ
eric@hoidanit.com.vn => hợp lệ
nhưng bạn nhập : tentoila@blabla => tên không hợp lệ ?
Làm sao để máy tính có thể hiểu 1 chuỗi (String), có thỏa mãn 1 điều kiện nào đó hay
không ?
Ở ví dụ trên, là kiểm tra tính hợp lệ của email ?
Tài liệu:
https://www.w3schools.com/java/java_regex.asp
1. Regular Expression là gì ?
Regular Expression (Viết tắt là RegEx : Biểu thức chính quy) là cách tạo ra một chuỗi các
ký tự "đặc biệt"
=> phục vụ mục đích: text search / text replace
Ví dụ về RegEx: "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"
Java hỗ trợ gói: java.util.regex để xử lý regular expression, bao gồm các class chính:
- Pattern Class: định nghĩa "hình thức để search"
- Matcher Class: được sử dụng để search
- PatternSyntaxException Class: xử lý exception về lỗi cú pháp