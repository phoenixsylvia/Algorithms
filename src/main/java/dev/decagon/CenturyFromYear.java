package dev.decagon;

public class CenturyFromYear {
    public static int century(int number) {
    double century = 0;
    century = (double) number / 100;
    int newCentury = (int)( Math.ceil(century));
    return newCentury;
}
  }

