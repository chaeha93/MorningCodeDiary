package recursive;

import java.io.*;
import java.util.*;

public class Main_BOJ_10994 {

    public static int N;
    public static char[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new char[4*N-3][4*N-3];

        for(int i=0; i<N; i++) {
            recursive(i);
        }
    }

    public static void recursive(int num) {


    }


}
