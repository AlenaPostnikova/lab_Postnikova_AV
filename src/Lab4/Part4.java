package Lab4;

import java.util.Arrays;

public class Part4 {
    public static void firstNum(int[] ints){

        int k = 0;

        for(int i=0; i<ints.length; i++){
            for(int j=0; j<ints.length; j++){
                if (i==j) continue;
                if (ints[i]==ints[j]) {
                    k++ ;
                }
            }
            if (k == 0){
                System.out.println(ints[i]);
                break;
            }
            k = 0;
        }

    }
}
