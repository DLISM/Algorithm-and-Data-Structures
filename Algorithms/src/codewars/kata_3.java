package codewars;

/**
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this
 * way until a single-digit number is produced. The input will be a non-negative integer.
 *
 * Examples
 *   16  -->  1 + 6 = 7
 *    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */

public class kata_3 {
    public static int digital_root(int n) {
        int result = 0;

        String s =String.valueOf(n);
        if(s.split("").length>1) {
            for (String item : s.split("")) {
                result += Integer.parseInt(item);
            }
            if(String.valueOf(result).split("").length>1){
               return digital_root(result);
            }
        }else {
            return n;
        }
        return result;
    }

    public static void main(String[] args) {
      System.out.println(digital_root(456));
      System.out.println(digital_root(132189));
      System.out.println(digital_root(493193));
    }
}
