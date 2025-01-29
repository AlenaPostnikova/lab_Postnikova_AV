package Lab9;

import java.util.Map;
import java.util.Scanner;

public class GetPoint {

   static Scanner scanner = new Scanner(System.in);

    public static Integer getPoint(Map<User, Integer> mapPoints){

        System.out.println("Введите имя игрока: ");
        String name = scanner.nextLine();

        for (Map.Entry<User, Integer> pair : mapPoints.entrySet()){

            String pairKeyName = pair.getKey().getName();
            Integer pairValue = pair.getValue();

            if (name.equals(pairKeyName)) {
                return pairValue;
            }
        }

        return 0;
    }
}
