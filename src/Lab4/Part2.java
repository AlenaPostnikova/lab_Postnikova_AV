package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {

    public static void enterArr(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите длину массива: ");
        int lengthArr = scanner.nextInt();
        int[] intArr = new int[lengthArr];

        System.out.println("Заполните массив значениями: ");

        for (int i=0; i<lengthArr; i++){
            intArr[i] = scanner.nextInt();
        }

        System.out.println("Результат" + Arrays.toString(intArr));

    }
}
