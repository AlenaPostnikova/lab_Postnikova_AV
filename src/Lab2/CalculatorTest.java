package Lab2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа через Enter:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        System.out.println("Введите два вещественных (через запятую) числа через Enter:");
//
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();

//        System.out.println("Введите два числа больше 2 млрд через Enter:");
//
//        long a = scanner.nextLong();
//        long b = scanner.nextLong();

        System.out.println("Результат сложение чисел = "+Calculator.fn_sum(a,b));
        System.out.println("Результат умножения чисел = "+Calculator.fn_multiply(a,b));
        System.out.println("Результат вычитания чисел = "+Calculator.fn_minus(a,b));
        System.out.println("Результат деления чисел = "+Calculator.fn_div(a,b));

    }
}
