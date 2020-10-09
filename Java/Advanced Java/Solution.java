import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] myInts = new int[n][n];
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            for (int j = 0; j < d; j++) {
                myInts[i][j] = scan.nextInt();
            }
        }
        System.out.println(myInts);
        scan.close();
    }
}

