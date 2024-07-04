package stack;

import java.io.*;
import java.util.*;

/*
 * BOJ 9012: 괄호
 * 1. '(' 스택에 넣는다.
 * 2. ')' 일 경우
 *  2-1. 스택 사이즈가 1 이상: '(' 빼서 짝꿍
 *  2-2. 스택 사이즈가 0이면: NO
 * 3. 스택 사이즈가 0이면 YES
 */

public class Main_BOJ_9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            Stack stack = new Stack<>();
            boolean flag = true;
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                Character c = str.charAt(j);
                if(c.equals('(')) {
                    stack.push('(');
                } else if(c.equals(')')) {
                    if(stack.size() > 0) {
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if(stack.size() == 0 && flag == true) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
