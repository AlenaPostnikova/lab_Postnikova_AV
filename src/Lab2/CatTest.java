package Lab2;

public class CatTest {
    public static void main(String[] args){

        Cat guri = new Cat("oriental", "Gurgen","brown", "blue", 2 );
        Cat noName = new Cat();

        noName.setName("Murka");

        System.out.println(guri);
        System.out.println(noName);

        System.out.println(noName.getName());
        System.out.println(guri.getBreed());
    }
}
