import java.io.FileReader;
import java.io.IOException;

public class ioexception {

    public static void main(String[] args)
        throws IOException {

        FileReader file =
            new FileReader("data.txt");

        System.out.println("File opened");

        file.close();
    }
}