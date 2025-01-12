package Lab5;

public class Palindrome {

    public static boolean methodPalindrome(StringBuilder word){

        if (word.toString().isEmpty()){
            return false;
        }

        StringBuilder drow = new StringBuilder(word);
        word.reverse();
        return (word.toString().equals(drow.toString()));
    }
}
