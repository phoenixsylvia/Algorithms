package dev.decagon;

public class PrinterErrors {
    public static String printerError(String s) {
        int count = 0;

        for(char element: s.toCharArray())
            if(element >'m'|| element < 'a')
                count++;

        return count + "/" + s.length();


    }
}
