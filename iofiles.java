import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class iofiles {
    public static void main(String [] args)
    {
        int lineCount = 0;
        int wordCount = 0;
        int characterCount = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\java\\iofiles.txt")))
        {
            String currentLine;
            while((currentLine = br.readLine()) != null)
            {
                lineCount++;
                characterCount += currentLine.length();
                String trimmed = currentLine.trim();
                if(!trimmed.isEmpty())
                {
                    wordCount += trimmed.split("\\s+").length;
                }
                System.out.println("Number of lines: " + lineCount);
                System.out.println("Number of words: " + wordCount);
                System.out.println("Number of characters: " + characterCount);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

}



