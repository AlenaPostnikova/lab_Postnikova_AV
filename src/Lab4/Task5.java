package Lab4;

public class Task5 {

    public static boolean isThree(int[] arrayNum){

        if (arrayNum.length<2){
            return false;
        }

        if ((arrayNum[0]==3) || (arrayNum[arrayNum.length-1]==3)){
            return true;
        }
        return false;
    }

}
