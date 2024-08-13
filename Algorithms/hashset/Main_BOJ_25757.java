package hashset;

import java.io.*;
import java.util.*;

/*
 * BOJ 25757: 임스와 함께하는 미니게임
 * HashSet: 데이터를 중복 없이 저장, NULL 허용, 순서 보장 X
 *
 */

public class Main_BOJ_25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        HashSet<String> list = new HashSet<>();

        int user = 0;
        if(str[1].equals("Y")) {
            user = 1;
        } else if(str[1].equals("F")) {
            user = 2;
        } else {
            user = 3;
        }

        for(int i=0; i<N; i++) {
            String name = br.readLine();
            list.add(name);
        }
        int result = list.size() / user;


        System.out.println(result);
    }
}
