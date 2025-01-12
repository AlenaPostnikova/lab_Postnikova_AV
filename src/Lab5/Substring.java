package Lab5;

public class Substring {
    public static int substringSearch(String string, String substring){

        if(string.contains(substring)){
            String[] arrString = string.split(substring);
            return arrString.length;
        }
        else return 0;
    }
}

