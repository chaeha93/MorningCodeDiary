package graph;

import java.io.*;
import java.util.*;

/* BOJ 1260: DFS와 BFS
 * - DFS: 깊이 우선 탐색, 모든 노드를 방문하고자 하는 경우, 스택 또는 재귀함수로 구현 ex) 미로찾기
 * - BFS: 너비 우선 탐색, 두 노드 사이의 최단 경로를 찾는 경우, 큐로 구현
 * */
public class Main_BOJ_1260 {

    public static StringBuilder sb = new StringBuilder();
    public static int N, M, V;
    public static boolean[][] arr;
    public static boolean[] isVisited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 1. N+1, N+1 배열에 연결 정보 담기
        arr = new boolean[N+1][N+1];
        isVisited = new boolean[N+1];
        for(int m=0; m<M; m++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = true;
            arr[b][a] = true;
        }
        // 2. DFS
        dfs(V);
        sb.append("\n");
        // 3. BFS
        isVisited = new boolean[N+1];
        bfs(V);

        System.out.println(sb);
    }

    private static void bfs(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);
        isVisited[num] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            sb.append(temp).append(" ");

            for(int i=1; i<=N; i++) {
                if(!isVisited[i] && arr[temp][i]) {
                    queue.offer(i);
                    isVisited[i] = true;
                }
            }
        }
    }

    private static void dfs(int num) {
        sb.append(num).append(" ");
        isVisited[num] = true;
        for(int i=1; i<=N; i++) {
            if(!isVisited[i] && arr[num][i]) {
                dfs(i);
            }
        }

    }
}
