package subset;

import java.io.*;
import java.util.*;
public class subset {

    static int N, S, totalCnt;
    static int[] input;
    static boolean[] isSelected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 집합의 원소 개수
        S = sc.nextInt(); // 합
        input = new int[N];
        isSelected = new boolean[N];

        for(int i=0; i<N; i++) {
            input[i] = sc.nextInt();
        }
        generateSubset(0);
        System.out.println("총 경우의 수: " + totalCnt);


    }

    private static void generateSubset(int cnt) {
        if(cnt == N) {
            int sum = 0, selectedCnt = 0;
            for(int i=0; i<N; i++) {
                if(isSelected[i]) {
                    sum += input[i];
                    selectedCnt++;
                }
            }

            if(sum == S && selectedCnt > 0) {
                ++totalCnt;
                for(int i=0; i<N; i++) {
                    if(isSelected[i]) {
                        System.out.print(input[i] + "\t");
                    }
                    System.out.println();
                }
            }
            return;
        }

        // 선택
        isSelected[cnt] = true;
        generateSubset(cnt + 1);

        // 비선택
        isSelected[cnt] = false;
        generateSubset(cnt + 1);

    }

}
