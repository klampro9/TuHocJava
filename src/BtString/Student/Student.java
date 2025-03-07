package BtString.Student;

public class Student {
    String name;
    String id;
    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', id='" + id + "'}";
    }
}
