package Student;
public class Student {
    private String name;
    private int age;
    String address;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public void setAge(int age1){
        this.age = age1;
    }
    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
