package Lab4;

import java.util.Scanner;

public class Task4 {

    public static boolean fnCompair(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        return (b>a)&&(c>b);
    }

}