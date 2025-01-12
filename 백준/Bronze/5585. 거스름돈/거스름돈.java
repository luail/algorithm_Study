import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = Integer.parseInt(br.readLine());

        int myMoney = 1000 - pay;
        int count = 0;

        while (myMoney != 0) {
            if (myMoney >= 500) {
                count += myMoney / 500;
                myMoney = myMoney % 500;
            }

            if (myMoney >= 100) {
                count += myMoney / 100;
                myMoney = myMoney % 100;
            }

            if (myMoney >= 50) {
                count += myMoney / 50;
                myMoney = myMoney % 50;
            }

            if (myMoney >= 10) {
                count += myMoney / 10;
                myMoney = myMoney % 10;
            }

            if (myMoney >= 5) {
                count += myMoney / 5;
                myMoney = myMoney % 5;
            }

            if (myMoney >= 1) {
                count += myMoney / 1;
                myMoney = myMoney % 1;
            }
        }
        System.out.println(count);
    }
}