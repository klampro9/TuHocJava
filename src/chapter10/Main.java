package chapter10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("./src/chapter10/xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if(in !=null){
                in.close();
            }
            if( out != null){
                out.close();
            }
        }
    }
}
