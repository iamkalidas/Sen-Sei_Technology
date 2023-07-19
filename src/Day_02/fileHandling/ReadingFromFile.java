package Day_02.fileHandling;
import java.io.*;
public class ReadingFromFile
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("example.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
