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

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getEyesColor(){
        return eyesColor;
    }

    public void setEyesColor(String eyesColor){
        this.eyesColor= eyesColor;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
