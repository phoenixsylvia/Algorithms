package dev.decagon;

public class MultiolesOf3or5 {
    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;

        if(number < 0){
            return 0;
        }
        for(int i = 1; i<number; i++){
            if(i%3 == 0 || i%5 ==0){
                sum+=i;
            }
        }
        return sum;
    }
}
