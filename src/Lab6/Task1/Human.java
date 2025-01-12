package Lab6.Task1;

public abstract class Human {

    protected String name;
    protected String surname;

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    protected abstract void printInfo();

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

}
