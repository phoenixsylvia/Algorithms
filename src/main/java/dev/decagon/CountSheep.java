package dev.decagon;

public class CountSheep {
    public static String countingSheep(int num) {
        //Add your code here
        String result = "";
        for(int i = 1; i<= num; i++){
            result += i + "" + " sheep...";
            //   System.out.println(i);
        }
        return result;
    }
}
