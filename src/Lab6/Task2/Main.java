package Lab6.Task2;

public class Main {
    public static void main(String[] args){

        BankEmployee worker = new BankEmployee("Vova", "Postnikov", "Sber");
        Client worker2 = new Client("Harry", "Potter", "Gringotts");

        worker.printInfo();
        worker2.printInfo();

    }

}
