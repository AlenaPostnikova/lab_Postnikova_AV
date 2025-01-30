package Lab10;

import java.io.*;

public class GlueFiles {
    public static File sumFileText(File file, File file2){

        File sumFile = new File("files/sumFile.txt");


        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             FileWriter fileWriter = new FileWriter(sumFile, true)){
            String input;

            while ((input = reader.readLine()) != null){
                fileWriter.write(input);
            }

        } catch (IOException e){
            System.err.println("Ошибка ввода-вывода:" + e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file2));
             FileWriter fileWriter = new FileWriter(sumFile, true)){
            String input;

            while ((input = reader.readLine()) != null){
                fileWriter.write(input);
            }

        } catch (IOException e){
            System.err.println("Ошибка ввода-вывода:" + e);
        }


        return sumFile;
    }
}
