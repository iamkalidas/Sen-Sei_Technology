package Day_02.fileHandling;
import java.io.*;
public class WritingInFile
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("output.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String data = "Hello, this is some text to write into the file.";
            bufferedWriter.write(data);
            System.out.println("Text added successfully");

            bufferedWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
