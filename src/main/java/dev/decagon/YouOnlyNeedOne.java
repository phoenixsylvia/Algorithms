package dev.decagon;

public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        // Your code here
        for(Object s: a){
            if(x.equals(s)){
                return true;
            }
        }
        return false;
    }
}
