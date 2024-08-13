package recursive;

import java.io.*;
import java.util.*;

/**
 * 1.  종이가 모두 같은 색상인지 확인
 * 2. 만약 모두 같지 않은 색상으로 이루어져 있다면 N/2 자름
 * 3. 1로 recursive
 * */

public class Main_BOJ_2630 {

    public static int N, white, blue;
    public static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursive(0);
    }

    public static void recursive(int cnt) {

    }

}
