import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        int[][] map = new int[x][y];
        boolean[][] visited = new boolean[x][y];

        int startX = 0;
        int startY = 0;

        for (int i = 0; i < x; i++) {
            String[] inputs2 =br.readLine().split(" ");
            for (int j = 0; j < y; j++) {
                int temp = Integer.parseInt(inputs2[j]);
                if (temp == 2) {
                    startX = i;
                    startY = j;
                }
                map[i][j] = temp;
            }
        }

        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{startX,startY,0});
        map[startX][startY] = 0;
        visited[startX][startY] = true;

        while (!que.isEmpty()) {
            int[] temp = que.poll();
            int nowX = temp[0];
            int nowY = temp[1];
            int distance = temp[2];

            if (nowX-1 > -1 && !visited[nowX-1][nowY] && map[nowX-1][nowY] == 1) {
                visited[nowX-1][nowY] = true;
                map[nowX-1][nowY] = distance+1;
                que.add(new int[]{nowX-1, nowY, distance+1});
            }

            if (nowY-1 > -1 && !visited[nowX][nowY-1] && map[nowX][nowY-1] == 1) {
                visited[nowX][nowY-1] = true;
                map[nowX][nowY-1] = distance+1;
                que.add(new int[]{nowX, nowY-1, distance+1});
            }

            if (nowX+1 < x && !visited[nowX+1][nowY] && map[nowX+1][nowY] == 1) {
                visited[nowX+1][nowY] = true;
                map[nowX+1][nowY] = distance+1;
                que.add(new int[]{nowX+1, nowY, distance+1});
            }

            if (nowY+1 < y && !visited[nowX][nowY+1] && map[nowX][nowY+1] == 1) {
                visited[nowX][nowY+1] = true;
                map[nowX][nowY+1] = distance+1;
                que.add(new int[]{nowX, nowY+1, distance+1});
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    map[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}