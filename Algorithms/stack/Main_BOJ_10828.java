package stack;

import java.io.*;
import java.util.*;

public class Main_BOJ_10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if(str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if(str.equals("pop")) {
                if(stack.size() > 0) {
                    int num = stack.pop();
                    sb.append(num).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            } else if(str.equals("size")) {
                sb.append(stack.size()).append('\n');
            } else if(str.equals("empty")) {
                    if(stack.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
            } else if(str.equals("top")) {
                if(!stack.isEmpty()) {
                    sb.append(stack.peek()).append('\n');
                } else {
                    sb.append(-1).append('\n');
                }
            }
        }
        System.out.println(sb);
    }

}
