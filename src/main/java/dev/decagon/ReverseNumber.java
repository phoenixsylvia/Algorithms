package dev.decagon;

import java.sql.SQLOutput;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 129;
        int remainder = 0;
        int revNumber = 0;

        while (number>0){
            remainder = number % 10;
            number = number / 10;
            revNumber = (revNumber * 10) + remainder;
        }
        System.out.println(revNumber);
    }

}
