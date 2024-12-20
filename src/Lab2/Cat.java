package Lab2;

public class Cat {
    private String breed;
    private String name;
    private String color;
    private String eyesColor;
    private int age;

    public Cat(){
    }

    public Cat(String breed, String name, String color, String eyesColor, int age){

        this.breed = breed;
        this.name = name;
        this.color = color;
        this.eyesColor = eyesColor;
        this.age = age;
    }

    public String toString(){
        return "Cat {" +
                "порода - "+ breed+
                ", кличка - "+ name+
                ", окрас - "+ color+
                ", цвет глаз - "+ eyesColor+
                ", возраст - "+ age+ ".";
    }

}
