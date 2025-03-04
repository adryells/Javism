import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "./src/a_random_text.txt";
        String outputFile = "./src/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}