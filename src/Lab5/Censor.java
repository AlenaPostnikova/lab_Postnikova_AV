package Lab5;

public class Censor {

    public static String censor(String text){

        String badWord = "бяка";
        String cutCensor = "[вырезано цензурой]";

        String newText = text.replace(badWord, cutCensor);
        return newText;
    }
}
