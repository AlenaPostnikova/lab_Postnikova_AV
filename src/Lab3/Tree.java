package Lab3;

public class Tree {
    private int ageTree;
    private boolean isAlive;
    private String nameTree;

    public Tree(int ageTree, String nameTree){
        this.ageTree = ageTree;
        this.nameTree = nameTree;
    }

    public Tree(int ageTree, String nameTree, boolean isAlive){
        this.ageTree = ageTree;
        this.nameTree = nameTree;
        this.isAlive = isAlive;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал.");
    }
}

class TreeProgram {
    public static void main(String[] args) {

        Tree birch = new Tree(15, "береза", true);
        Tree whompingWillow = new Tree(111, "гремучая ива", true);
        Tree oak = new Tree();
    }
}

