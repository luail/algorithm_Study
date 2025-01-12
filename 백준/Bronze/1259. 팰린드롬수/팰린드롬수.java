import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> deque;
        while (true){
            String input = br.readLine();
            if (input.equals("0")) {
                return;
            }
            deque = new LinkedList<>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                deque.addLast(c);
            }

            if (deque.size() % 2 == 0) {
                while (!deque.isEmpty()) {
                    if (deque.peekLast() == deque.peekFirst()) {
                        deque.pollLast();
                        deque.pollFirst();
                    } else {
                        System.out.println("no");
                        break;
                    }
                }
                if (deque.isEmpty()) {
                    System.out.println("yes");
                }
            } else {
                while (deque.size() != 1) {
                    if (deque.peekLast() == deque.peekFirst()) {
                        deque.pollLast();
                        deque.pollFirst();
                    } else {
                        System.out.println("no");
                        break;
                    }
                }
                if (deque.size() == 1) {
                    System.out.println("yes");
                }
            }
        }

    }
}