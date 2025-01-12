package Lab3;

public class House {
    private int numberFloors;
    private int yearConstruction;
    private String nameHouse;

    public House(){
    }

    public House(int numberFloors, int yearConstruction, String nameHouse){
        this.numberFloors = numberFloors;
        this.yearConstruction = yearConstruction;
        this.nameHouse = nameHouse;
    }

    public void setNumberFloors(int numberFloors){
        this.numberFloors = numberFloors;
    }

    public void setYearConstruction(int yearConstruction){
        this.yearConstruction = yearConstruction;
    }

    public void setNameHouse(String nameHouse){
        this.nameHouse = nameHouse;
    }

    @Override
    public String toString(){
        return "numberFloors= " + numberFloors +
        ", yearConstruction= " + yearConstruction +
        ", nameHouse= " + nameHouse;
    }

    public int ageHouse(){
        return (2025-this.yearConstruction);
    }
}

class HouseTest{
    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House(12, 1964, "Cosmos");

        house1.setNameHouse("Hogwarts");
        house1.setNumberFloors(10);
        house1.setYearConstruction(902);

        System.out.println(house1.toString());
        System.out.println(house2.toString());

        System.out.println("Хогвартсу уже " + house1.ageHouse() + " лет.");
    }
}
