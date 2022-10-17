package dev.decagon;
import java.util.ArrayList;
import java.util.List;

public class CountByX {
//    Create a function with two arguments that will return an array of the first n multiples of x.
//Assume both the given number and the number of times to count will be positive numbers greater than 0.
//Return the results as an array or list ( depending on language ).

        public static int[] countBy(int x, int n) {
            // Your code here

            List<Integer> num = new ArrayList<Integer>();
            for(int i = 1; i <= n; i++){
                num.add(x * i);
            }

            System.out.println(num.toString());

            int[] arr = new int[num.size()];
            for(int j = 0; j < num.size(); j++){
            arr[j] = num.get(j);
          }
      //            OR
     //       arr = num.stream().mapToInt(i -> i).toArray();

            return arr;
        }
    }

