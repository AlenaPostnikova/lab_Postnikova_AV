package Lab7;

public class Plane {

    public void createWing(int i){
        Wing wing = new Wing();
        wing.weightWing = i;
        System.out.println("Вес крыла = " + wing.getWeightWing());
    }

    public class Wing{

        private int weightWing;
        
        public int getWeightWing(){
            return weightWing;
        }
    }
}
