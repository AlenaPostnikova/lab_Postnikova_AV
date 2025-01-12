package Lab5;

public class Opposite {

    public static StringBuilder methodOpposite(StringBuilder text){

        StringBuilder newText = new StringBuilder();
        text.reverse();
        String[] wordText = text.toString().split(" ");

        for (int i = wordText.length; i>0; i--){
            newText.append(wordText[i-1]+" ");
            System.out.println(newText);
        }
        return newText;
    }
}
