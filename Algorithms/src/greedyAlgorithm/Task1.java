/*

покрыть отрезки точками

По данным nn отрезкам необходимо найти множество точек минимального размера,
для которого каждый из отрезков содержит хотя бы одну из точек.

В первой строке дано число 1 \le n \le 1001≤n≤100 отрезков.
Каждая из последующих nn строк содержит по два числа 0 \le l \le r \le 10^90≤l≤r≤10 9,
задающих начало и конец отрезка. Выведите оптимальное число mm точек и сами mm точек.

Если таких множеств точек несколько, выведите любое из них.
*/

package greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] data = new int[n][];
//        int i = 0;
//        while (i<data.length) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            data[i++] = new int[]{a,b};
//        }

//        int[][] data = {{1,3}, {2,5}, {3,6}};
        int[][] data = {{4,7}, {1,3}, {2,5}, {5,6}};


        Arrays.sort(data,(o1, o2) -> {
            int v = o1[1] - o2[1];
            return v != 0 ? v : o1[0] - o2[0];
        });
        String[] res = cover(data);
        System.out.println(res.length);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }
    }

    public static String[] cover(int[][] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0, l = arr.length; i < l ; i++ ) {
            int point = arr[i][1];
            for (int j = i ; j < l && point <= arr[j][1] && point >= arr[j][0] ; j++) {
                i = j;
            }
            sb.append(point).append(" ");

        }
        return sb.toString().split(" ");
    }
}
