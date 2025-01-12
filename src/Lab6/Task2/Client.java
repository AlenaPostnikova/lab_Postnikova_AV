package Lab6.Task2;

public class Client implements Human {

    protected String name;
    protected String surname;
    protected String nameBank;

    public Client(String name, String surname, String nameBank){
        this.name = name;
        this.surname = surname;
        this.nameBank = nameBank;
    }

    @Override
    public void printInfo(){
        System.out.println(name + " " + surname + " " + nameBank);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getSurname(){
        return surname;
    }
}
