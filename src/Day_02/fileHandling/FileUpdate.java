package Day_02.fileHandling;
import java.io.*;
public class FileUpdate
{
    public static void main(String[] args)
    {
        try
        {
            // Step 1: Read the existing content of the WritingInFile
            File file = new File("C:\\Users\\kalid\\Documents\\Intellij Idea Projects\\Sen-Sei Technology\\src\\Day_02\\example.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null)
                content.append(line).append("\n");
            bufferedReader.close();

            // Step 2: Modify the content as needed
            String updatedContent = content.toString().replace("Kalidas", "I am Kalidas Vitthal");

            // Step 3: Write the updated content back to the WritingInFile
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(updatedContent);
            bufferedWriter.close();
            System.out.println("File updated successfully!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}