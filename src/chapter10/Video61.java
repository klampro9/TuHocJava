package chapter10;

public class Video61 extends Thread{
    public void run(){
        System.out.println("Hello from Thread");
        long sum = 0L;
        for( long i = 0L; i< 10000000000L; i++){
            sum +=i;
        }
        System.out.println("end Thread");
    }
    public static void main(String[] args) {
        int Max = 2;
        for(int i = 0; i< Max; i++){
            (new Video61()).start();
        }
        System.out.println("finish");
    }
}
