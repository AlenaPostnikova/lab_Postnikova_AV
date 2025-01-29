package Lab10;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {

        File file = new File("files/textTask1.txt");
        ArrayList<String> textList = ReaderFile.readerFile(file);
        System.out.println(textList);

        File file2 = CreateFile.createFile("Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель,\n" +
                "жизненную задачу, он невольно дает себе оценку. По тому, ради чего человек живет, можно судить и о \n" +
                "его самооценке - низкой или высокой.");


        File newFile = GlueFiles.sumFileText(file, file2);

        Dollar.addDollar(new File("files/dollar.txt"));

    }
}
