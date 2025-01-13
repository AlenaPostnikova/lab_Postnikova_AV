package Lab4;

import java.util.Arrays;

public class Part4 {
    public static int firstNum(int[] ints){

        int k = 0;

        for(int i = 0; i < ints.length; i++){
            for(int j = 0; j < ints.length; j++){
                if (i == j) continue;
                if (ints[i] == ints[j]) {
                    k++ ;
                }
            }
            if (k == 0){
                return ints[i];
            }
            k = 0;
        }
        return 0;
    }
}
