package recursive;

import java.io.*;

public class Main_BOJ_17478 {

    public static StringBuilder sb = new StringBuilder();
    public static String[] arr = {"\"재귀함수가 뭔가요?\"", "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.", "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.", "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        recursive(0, N);
        System.out.println(sb);

    }
    public static void recursive(int cnt, int num) {
        int a = 4 * cnt;
        String under = "";
        for(int i=1; i<=a; i++) {
            under += "_";
        }

        if(cnt == num) {
            sb.append(under + arr[0] + "\n" + under + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n" + under + "라고 답변하였지.\n");

            while(a>0) {
                a -= 4;
                under = "";
                for(int i=1; i<=a; i++) {
                    under += "_";
                }
                sb.append(under + "라고 답변하였지.\n");
            }

            return;
        } else {
            sb.append(under + arr[0] + "\n" + under + arr[1] + "\n" + under + arr[2] + "\n" + under + arr[3] + "\n");
            recursive(cnt+1, num);
        }

    }

}

