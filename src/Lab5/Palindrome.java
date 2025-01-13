package Lab5;

import java.util.Objects;

public class Palindrome {

    public static boolean methodPalindrome(StringBuilder word){

        if ((word == null) || (word.toString().isEmpty())){
            return false;
        }

        StringBuilder drow = new StringBuilder(word);
        word.reverse();
        return (word.toString().equalsIgnoreCase(drow.toString()));
    }
}
