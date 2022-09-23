package dev.decagon;

public class ReverseWords {
    public static String reverseWords(final String original)
    {
        String [] word = original.split(" ");

        if(word.length == 0){
            return original;
        }

        for(int i = 0; i < word.length; i++) {

            word[i] = new StringBuilder(word[i]).reverse().toString();
        }
        return String.join(" ", word);

    }
}
