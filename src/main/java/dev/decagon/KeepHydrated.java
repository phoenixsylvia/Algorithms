package dev.decagon;

public class KeepHydrated {
    public int Liters(double time)  {

        //Your code goes here! Hint: You should change that -1
        int litres = 0;

        litres =( int )Math.floor(time * 0.5);

        return litres;

    }
}
