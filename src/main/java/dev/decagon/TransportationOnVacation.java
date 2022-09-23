package dev.decagon;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        // Your solution here
        int total = 40 * d;

        if(d >= 7){
            total-=50;
        } else if( d >= 3) {
            total-=20;
        }
        return total;
    }
}
