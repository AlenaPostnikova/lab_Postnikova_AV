package Lab4;

public class Task5 {

    public static boolean isThree(int[] arrayNum){

        // убрала проверку, что массив состоит не менее, чем из 2х элементов, но это в условии задания было

        if ((arrayNum[0] == 3) || (arrayNum[arrayNum.length-1] == 3)){
            return true;
        }
        return false;
    }

}
