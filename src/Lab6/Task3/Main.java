package Lab6.Task3;

public class Main {
    public static void main(String[] args){

        Truck man = new Truck(20000, "MAN", (char)114, 60.5F, 20005, 12);

        man.newWheels(11);

        man.outPut();

    }
}
