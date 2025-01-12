package Lab6.Task5;

public class Main {
    public static void main(String[] args){

        MyAge ageGuri = new MyAge();
        ageGuri.enter();

        MyName nameGuri = new MyName();
        nameGuri.enter();
        System.out.println("----------------\n" +
                "Имя - " + nameGuri.getName() +
                ", его возраст - " + ageGuri.getAge());
    }
}
