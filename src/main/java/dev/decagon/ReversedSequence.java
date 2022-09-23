package dev.decagon;

import java.util.ArrayList;
import java.util.List;

public class ReversedSequence {
    public static int[] reverse(int n){
        //your code
        int [] newNum = new int[n] ;
        for (int i = n; i > 0; i--){
            newNum[n-i] = i;
        }
        return newNum;
    }

}
