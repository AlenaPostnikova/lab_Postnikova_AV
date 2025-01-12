package Lab6.Task3;

public class Truck extends Car {

    private int maxWeight;
    private int numWheels;

    public Truck(int w, String m, char c, float s, int maxWeight, int numWheels){
        super(w, m, c, s);
        this.maxWeight = maxWeight;
        this.numWheels = numWheels;
    }

    public void newWheels(int numWheels) {
        this.numWheels = numWheels;
        System.out.println("Новое количество колес - " + numWheels);
    }

}
