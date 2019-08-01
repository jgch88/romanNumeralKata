package com.company;

import java.util.*;

public class RomanNumeral {

    public static String convertArabicToRomanNumeral(int arabic){
        if (romanBaseNumbers.containsKey(arabic)){
            return romanBaseNumbers.get(arabic);
        }
        int index = 0;

        String output = "";
        while (arabic % 10 != 0) {
            String innerOutput = "";
            String lower = romanNumerals.get(index);
            String middle = romanNumerals.get(index + 1);
            String upper = romanNumerals.get(index + 2);

            int remainder = arabic % 10;
            int quotient = arabic / 10;

            if (remainder < 5) {
                if (remainder == 4) {
                    innerOutput = lower + middle;
                } else {
                    for (int i = 0; i < remainder; i++) {
                        innerOutput += lower;
                    }
                }
            } else {
                if (remainder == 9) {
                    innerOutput = lower + upper;
                } else {
                    innerOutput += middle;
                    for (int i = 0; i < remainder - 5; i++) {
                        innerOutput += lower;
                    }
                }
            }
            output = innerOutput + output;

            arabic = quotient;
            index += 2;
        }

        return output;
    }

    private static ArrayList<String> romanNumerals = new ArrayList<String>(Arrays.asList(
            "I", "V", "X", "L", "C", "D", "M"
    ));

    private static HashMap<Integer, String> romanBaseNumbers = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
        }
    };

}
