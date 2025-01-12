import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] small = new int[9];

        int sum = 0;

        for (int i = 0; i < small.length; i++) {
            small[i] = Integer.parseInt(br.readLine());
            sum += small[i];
        }
        Arrays.sort(small);

        int out = sum - 100;
        int check1 = 0;
        int check2 = 0;

        for (int i = 0; i < small.length-1; i++) {
            for (int j = 0; j < small.length; j++) {
                if (i == j) {
                    continue;
                }
                if (small[i] + small[j] == out) {
                    check1 = small[i];
                    check2 = small[j];
                }
            }
        }

        for (int i = 0; i < small.length; i++) {
            if (small[i] == check1 || small[i] == check2) {
                continue;
            }
            System.out.println(small[i]);
        }
    }
}