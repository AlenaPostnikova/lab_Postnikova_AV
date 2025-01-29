package Lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
    public static void main(String[] args){

//        List<Object> list = new ArrayList<>();
//
//        for (int i = 0; i < 15; i++){
//
//            Object o = new Object();
//            list.add(o);
//        }
//
//        list.addAll(list);
//
//        System.out.println(list);
//        System.out.println(Original.methodOriginal((ArrayList<Object>) list));

//        User mike = new User();
//        mike.setName("Mike");
//
//        User bob = new User();
//        bob.setName("Bob");
//
//        User pegas = new User();
//        pegas.setName("Pegas");
//
//        User peppa = new User();
//        peppa.setName("Peppa");
//
//        User harry = new User();
//        harry.setName("Harry");
//
//        User pig = new User();
//        pig.setName("Pig");
//
//        Map<User,Integer> map = new HashMap();
//
//        map.put(mike, 89);
//        map.put(bob, 64);
//        map.put(pegas, 18);
//        map.put(peppa, 3400);
//        map.put(harry, 15);
//        map.put(pig, 2100);
//
//        System.out.println(GetPoint.getPoint(map));

        List list = LargeList.addElements();
        ChoiceElement.methodChoiceElement(list);
    }
}





