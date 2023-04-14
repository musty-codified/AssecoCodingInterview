package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public int solution (int [] integers){
        int returnValue = 0;
           for (int i = 0; i < integers.length; i++) {
               if (integers.length % 2 == 0) {
                   if (integers[i] != integers[i + 2]) {

                       return integers[i];
                   } else {

                   }
               }
           }
        return returnValue;
    }


    public int solution2 ( int N ) {
        String binary = Integer.toBinaryString(N);
        int returnValue = 0;
        int gap = 0;
        boolean counting = false;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (counting) {
                    returnValue = Math.max(returnValue, gap);
                    gap = 0;
                } else {
                    counting = true;
                }
            } else if (counting) {
                gap++;
            }
        }
        return returnValue;



    }


    public List<Integer> solution3 ( int [] numbers){


        List<Integer>  newArr = new ArrayList<>();


        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 != 0 && numbers[i] > 2 ){
                 newArr.add(numbers[i]);

            }
        }




        return newArr;
    }
}





