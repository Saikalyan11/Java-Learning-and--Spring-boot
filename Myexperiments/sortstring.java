package Myexperiments;

import java.util.*;

public class sortstring {
    public static void main(String[] args) {

        // Using small ltters
        String str = "java";

        char[] ch = str.toCharArray(); // Converts String element into Char Array ex: {J,a,v,a}
        Arrays.sort(ch); // so by this we can sort the characters from ch array
        String sortedstring = new String(ch); // We use this to convert a char array into normal String
        System.out.println("using small letters " + sortedstring);
        // while using small letters it is print in perfect ascending order

        // using Capital letter
        String str1 = "Java Is Love";
        char[] ch1 = str1.toCharArray(); // Converts String element into Char Array ex: {J,a,v,a}
        Arrays.sort(ch1); // so by this we can sort the characters from ch array
        String newsortedstring = new String(ch1); // We use this to convert a char array into normal String
        System.out.println("Using Captial Letters" + newsortedstring);
        // Where as while using Capital letters all the capital letters are 1st printing
        // in ascending order and then small letters are printing in ascending order
        // And As there are 3 words in this string the space betn words are 1st printing
        // and then capital letters and then small letters

    }
}