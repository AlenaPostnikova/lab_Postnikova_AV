package Lab4;

import java.util.Scanner;

public class Task3 {

    public static boolean fnSum(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        return (a+b==c);

    }

}
