package Lab10;

import java.io.*;
import java.util.ArrayList;

public class ReaderFile {

    public static ArrayList<String> readerFile(File file){

        ArrayList<String> list = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String input;

                while ((input = reader.readLine()) != null){
                    list.add(input);
                }
            } catch (IOException e){
                System.err.println("Ошибка ввода-вывода:" + e);

            }

        return list;
    }

}
