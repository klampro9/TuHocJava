package chapter8;

public class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {
        System.out.println("Zzz");
    }
    
}
