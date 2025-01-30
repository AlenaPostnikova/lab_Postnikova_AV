package Lab10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static File createFile(String text){

        File file = new File("files/textTask2.txt");

        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(text);
        } catch (IOException e){
            System.out.println();
        }

        return file;
    }

}
