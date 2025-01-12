package Lab6.Task5;

public class MyName extends MyAge{

    private String name;


    @Override
    public void enter(){
        System.out.println("Введите имя:");

        this.name = scanner.nextLine();
    }

    public String getName(){
        return name;
    }

}
