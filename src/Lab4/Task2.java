package Lab4;

public class Task2 {

    public static void divider(){

        System.out.println("Делятся на 3: ");
        for (int i = 1; i < 100; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\nДелятся на 5: ");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\nДелятся на 3 и на 5: ");
        for (int i = 1; i < 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print(i + " ");
            }
        }

    }

}
