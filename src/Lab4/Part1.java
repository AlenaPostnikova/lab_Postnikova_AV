package Lab4;

public class Part1 {

    public static String  increase(int[] arrInt){

        for (int i = 1; i < arrInt.length; i++){
            if (arrInt[i] < arrInt[i-1]){
                return "Please, try again";
            }
        }
        return "OK";
    }
}
