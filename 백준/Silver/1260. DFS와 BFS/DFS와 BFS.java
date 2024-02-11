import java.util.*;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int repeat = sc.nextInt();
        int start = sc.nextInt();

        list = new ArrayList[node+1];
        check = new boolean[node+1];

        for (int i = 0; i <= node; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < repeat; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            list[num1].add(num2);
            list[num2].add(num1);
        }

        for(int i=1; i<=node; i++) {
            Collections.sort(list[i]);
        }

        dfs(start);
        sb.append("\n");
        Arrays.fill(check, false);
        bfs(start);

        System.out.println(sb);
    }

    public static void dfs(int node) {
        check[node] = true;
        sb.append(node).append(" ");

        for(int next : list[node]) {
            if(!check[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");

            for(int next : list[node]) {
                if(!check[next]) {
                    queue.add(next);
                    check[next] = true;
                }
            }
        }
    }
}
