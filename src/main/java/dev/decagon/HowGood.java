package dev.decagon;

public class HowGood {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int average = 0;
        int sum = 0;
        for(int i = 0; i < classPoints.length; i++){
            sum+=classPoints[i];

        }
        average = (sum + yourPoints) / (classPoints.length + 1);
        if(yourPoints > average){
            return true;
        }



        return false;
    }
}
