package Lab6.Task5;

import java.util.Scanner;

public class MyAge {

    protected Scanner scanner = new Scanner(System.in);
    private int age;

    public void enter(){
        System.out.println("Введите возраст:");

        this.age = scanner.nextInt();
    }

    public int getAge(){
        return age;
    }

}
