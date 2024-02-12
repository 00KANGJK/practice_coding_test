import java.io.*;
import java.util.*;

public class Main {
    static int maxA, maxB, maxC;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        maxA = Integer.parseInt(st.nextToken());
        maxB = Integer.parseInt(st.nextToken());
        maxC = Integer.parseInt(st.nextToken());

        answer = new ArrayList<>();

        bfs();

        Collections.sort(answer);
        for (int ans : answer) {
            System.out.print(ans + " ");
        }
    }

    static class Bottle {
        int a;
        int b;
        int c;

        public Bottle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static void bfs() {
        Queue<Bottle> q = new LinkedList<>();
        boolean[][][] visited = new boolean[maxA + 1][maxB + 1][maxC + 1];

        q.add(new Bottle(0, 0, maxC));
        while (!q.isEmpty()) {
            Bottle curr = q.poll();
            if (visited[curr.a][curr.b][curr.c])
                continue;

            if (curr.a == 0) {
                answer.add(curr.c);
            }

            visited[curr.a][curr.b][curr.c] = true;

            transfer(q, curr.a, curr.b, curr.c, maxA, 0);
            transfer(q, curr.a, curr.b, curr.c, maxB, 1);
            transfer(q, curr.a, curr.b, curr.c, maxC, 2);
        }
    }

    // Transfer water from one bottle to another
    static void transfer(Queue<Bottle> q, int a, int b, int c, int max, int type) {
        int[] arr = {a, b, c};
        for (int i = 0; i < 3; i++) {
            if (i == type) continue;
            if (arr[i] + arr[type] <= max) {
                arr[type] += arr[i];
                arr[i] = 0;
            } else {
                arr[i] = arr[i] + arr[type] - max;
                arr[type] = max;
            }
            q.add(new Bottle(arr[0], arr[1], arr[2]));
            arr = new int[]{a, b, c};
        }
    }
}
