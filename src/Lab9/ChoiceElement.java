package Lab9;

import java.util.List;
import java.util.Random;

public class ChoiceElement {

    public static void methodChoiceElement(List list){

        Random r = new Random();

        for (int i = 0; i < 100000; i++){

            int numElement = r.nextInt(99999);
            Object element = list.get(numElement);
        }

        System.out.println("Выполнение завершено.");
    }


}
