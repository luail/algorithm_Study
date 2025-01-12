import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Set<String> visited = new HashSet<>();
    static int maxLength = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int high = Integer.parseInt(inputs[0]);
        int length = Integer.parseInt(inputs[1]);

        String[][] alphas = new String[high][length];
        for (int i = 0; i < high; i++) {
            String line = br.readLine();
            for (int j = 0; j < length; j++) {
                alphas[i][j] = String.valueOf(line.charAt(j));
            }
        }
        int currentMax = 0;
        board(high, length, 0,0,alphas,currentMax);
        System.out.println(maxLength);
    }

    public static void board (int high, int length, int x, int y, String[][] alphas, int currentMax) {
        if (x < 0 || y < 0 || x >= high || y >= length || visited.contains(alphas[x][y])) {
            return;
        }

        visited.add(alphas[x][y]);
        currentMax++;
        maxLength = Math.max(maxLength, currentMax);

        board(high,length,x+1,y,alphas,currentMax);
        board(high,length,x-1,y,alphas,currentMax);
        board(high,length,x,y+1,alphas,currentMax);
        board(high,length,x,y-1,alphas,currentMax);
        visited.remove(alphas[x][y]);
    }
}




