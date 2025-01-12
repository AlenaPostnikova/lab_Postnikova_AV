package Lab3;

public class Car {
    private String color;
    private String brand;
    private int mass;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int mass) {
        this.color = color;
        this.mass = mass;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{ " +
                "brand= " + brand +
                ", color= " + color +
                ", mass= " + mass + " кг }";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

}

class CarTest{
    public static void main(String[] args) {

        Car myCar = new Car("black", 1840);

        myCar.setBrand("KIA");

        Car myHusbandCar = new Car();

        myHusbandCar.setBrand("Honda");
        myHusbandCar.setColor("grey");
        myHusbandCar.setMass(1900);

        System.out.println(myCar);
        System.out.println(myHusbandCar);
    }

}
