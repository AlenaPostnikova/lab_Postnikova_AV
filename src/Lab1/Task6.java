package Lab1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b%2 != 0){
            System.out.println("Нечетное");
        }
        else if (b > 100){
            System.out.println("Выход за пределы диапазона");
        }
        else System.out.println("Четное");
    }
}
