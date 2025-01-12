package Lab4;

public class Part3 {

    public static int[] change(int[] ints){

        ints[0] = ints[0] + ints[ints.length-1];
        ints[ints.length-1] = ints[0] - ints[ints.length-1];
        ints[0] = ints[0] - ints[ints.length-1];

        return ints;
    }
}
