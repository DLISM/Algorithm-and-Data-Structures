package codewars;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kata_1 {

    public static String maskToString(int [] numbers){
        String text = Arrays.toString(numbers).replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        Pattern pattern = Pattern.compile("(...)(...)(....)");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return null;
    }

    public static void main(String[] args) {

        System.out.println(maskToString(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

    }
}
