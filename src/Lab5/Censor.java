package Lab5;

public class Censor {

    public static String censor(String text){
        String newText = text.replace("бяка","[вырезано цензурой]");
        return newText;
    }
}
