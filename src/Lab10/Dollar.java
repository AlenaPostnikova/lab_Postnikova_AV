package Lab10;

import java.io.*;
import java.util.ArrayList;

public class Dollar {

    public static void addDollar(File file){

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String input;
            String change;

            while ((input = reader.readLine()) != null){

                change = input.replaceAll("[^0-9а-яА-ЯA-Za-z]", "*");
                list.add(change);

            }
        } catch (IOException e){
            System.err.println("Ошибка ввода-вывода:" + e);
        }

        try (FileWriter fileWriter = new FileWriter(file)){

            for (String line : list){
                fileWriter.write(line);
            }

        } catch (IOException e){
            System.err.println("Ошибка ввода-вывода:" + e);
        }

    }
}
