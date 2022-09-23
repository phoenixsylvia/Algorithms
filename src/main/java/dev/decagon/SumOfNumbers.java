package dev.decagon;

public class SumOfNumbers {
    public int GetSum(int a, int b){
        int sum = 0;

        int minNum = Math.min(a,b);
        int maxNum = Math.max(a,b);
        for(int i = minNum; i <= maxNum; i++){
            sum+= i;
        }

        return sum;
    }
}
