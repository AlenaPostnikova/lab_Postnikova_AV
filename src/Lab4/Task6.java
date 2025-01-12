package Lab4;

public class Task6 {

    public static boolean search(int[] arrInt){

        for(int k : arrInt){
            if (k==1 || k==3){
                return true;
            }
        }
        return false;
    }

}
