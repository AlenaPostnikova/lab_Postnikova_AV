package Lab6.Task1;

public class Main {

    public static void main(String[] args){

        Client vova = new Client("Vladimir", "Postnikov", "Sber");

//        vova.setName("Vladimir");
//        vova.setSurname("Postnikov");
//        vova.setNameBank("Sber");

        BankEmployee guri = new BankEmployee("Gurgen", "Plushikov", "CatBankBang");

        vova.printInfo();
        guri.printInfo();
    }

}
