package Lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LargeList {

    public static List addElements(){

//        List aList = new ArrayList();
        List lList = new LinkedList();

        for (int i = 0; i < 100000; i++){

//            aList.add(i); // время выполнения 03:30
            lList.add(i); // время выполнения 07:75
        }

//    return aList;
    return lList;

    }

}
