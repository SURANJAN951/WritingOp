import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//ham ish program me file ke andar writing operation karna sikhenge...pwsills.txt me ham
//writting operation karenge.

public class WritingOp {
    public static void main(String[] args) throws IOException {
        // Reference to the existing "pwsills.txt" file inside the "PwJava" directory
        File file = new File("PwJava/pwsills.txt");
        FileWriter fw = new FileWriter(file);

        //FileWriter fw = new FileWriter(file,true); it enables append mode,
        // so new data is added to the end of the file instead of overwriting it.

        fw.write("hello ji");
        fw.write("hello");
        fw.write("\n");
        fw.write(97);//ye ascii formate me store hoga jaise (65->a) in ascii formate
        char ch[]={'j','a','v','a'};
        fw.write(ch);

        fw.close();
        //bina file ko close kiye aap isko run nhi kar sakte,because ye
        // bufferLocation me jaake store ho jata hai ishi umeed me ki koi aur data ayega.
        //I can also use fw.flush();
        System.out.println("Open the file pwsills.txt");
    }
}

