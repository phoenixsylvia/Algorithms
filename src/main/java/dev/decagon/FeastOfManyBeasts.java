package dev.decagon;

public class FeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        char [] beastChar = beast.toCharArray();
        char [] dishChar = dish.toCharArray();


        if(beastChar[0] == dishChar[0] && beastChar[beastChar.length-1] == dishChar[dishChar.length-1]){
            return true;
        }


        return false;

    }
}
