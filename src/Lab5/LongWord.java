package Lab5;

public class LongWord {

    public static String searchLongWord(String someText){

        String[] arrSomeText = someText.split(" ");
        String result = arrSomeText[0];

        for (String word : arrSomeText){
            if (word.length() > result.length()){
                result = word;
            }
        }

        return result;
    }

}
