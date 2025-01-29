package Lab9;

import java.util.ArrayList;
import java.util.HashSet;

public class Original {
    public static HashSet<Object> methodOriginal(ArrayList<Object> list){

        HashSet<Object> result = new HashSet<>();

        result.addAll(list);

        return result;
    }

}
