package leetcode.String;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        var numerals=new  HashMap<Character, Integer>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);

        System.out.println(numerals);

        String input="IV";

        int n = input.length();
        int res=numerals.get(input.charAt(n-1));

        for( int i=n-2; i>=0; i--){

            char curr = input.charAt(i);
            char next =input.charAt(i+1);

            if(numerals.get(curr)<numerals.get(next))
                res-=numerals.get(curr);
            else
                res+= numerals.get(curr);

        }
        System.out.println(res);
    }
}
