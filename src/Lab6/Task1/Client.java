package Lab6.Task1;

public class Client extends Human {

    private String nameBank;

    public Client(String name, String surname, String nameBank){
        super(name, surname);
        this.nameBank = nameBank;
    }

    @Override
    protected void printInfo(){
        System.out.println(name + " " + surname + " " + nameBank);
    }

    public void setNameBank(String nameBank){
        this.nameBank = nameBank;
    }
}
