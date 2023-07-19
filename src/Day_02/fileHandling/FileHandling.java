package Day_02.fileHandling;
import java.io.*;
public class FileHandling
{
    public static void main(String[] args)
    {
        // Writing to a file
        try
        {
            String contentToWrite = "This is the content that will be written to the file.";
            File writeFile = new File("example.txt");
            FileWriter fileWriter = new FileWriter(writeFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(contentToWrite);

            bufferedWriter.close();
            System.out.println("File writing complete!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // Reading from a file
        try
        {
            File readFile = new File("example.txt");
            FileReader fileReader = new FileReader(readFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("File content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // Appending to a file
        try
        {
            String contentToAppend = "This is the content that will be appended to the file.";
            File appendFile = new File("example.txt");
            FileWriter fileWriter = new FileWriter(appendFile, true); // Set true for append mode
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.newLine(); // Adding a new line before appending
            bufferedWriter.write(contentToAppend);

            bufferedWriter.close();
            System.out.println("File appending complete!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Updating a file
        try
        {
            File file = new File("example.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            bufferedReader.close();

            String updatedContent = content.toString().replace("old_text", "new_text");

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(updatedContent);

            bufferedWriter.close();
            System.out.println("File updating complete!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}