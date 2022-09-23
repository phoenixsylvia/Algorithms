package dev.decagon;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String elements = morseCode.trim();
        String result = "";
        String[] singles = elements.split("   ");

        int len = singles.length;

        for(int i = 0; i < singles.length; i++){
            String[] ones = singles[i].split(" ");

            for(int j = 0; j < ones.length; j++){
                String y = MorseCode.get(ones[j]);
                result += y;
            }
            if(len > 1){
                result += " ";
                len--;
            }
        }
        return result;
    }
}
