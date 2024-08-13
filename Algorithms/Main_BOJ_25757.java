import java.io.*;
import java.util.*;
public class Main_BOJ_25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        List<String> list = new ArrayList<>();
        int result = 0;

        int user = 0;
        if(str[1] == "Y") {
            user = 1;
        } else if(str[1] == "F") {
            user = 2;
        } else {
            user = 3;
        }

        int cnt = 0;
        for(int i=0; i<N; i++) {
            String name = br.readLine();

            boolean isGamed = false;
            for(String s : list) {
                if(s == name) {
                    isGamed = true;
                }
            }
            if(!isGamed) {
                list.add(name);
                cnt++;
            }
            isGamed = false;
            if(cnt == user) {
                result++;
                cnt = 0;
            }

        }
        System.out.println(result);
    }

}
