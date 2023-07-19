package Day_02.fileHandling;
import java.io.*;

public class OpeningFile
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("output.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // Your write operations go here...

            bufferedWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
