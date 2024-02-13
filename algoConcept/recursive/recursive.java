package recursive;

import java.io.*;
import java.util.*;

/**
 * 재귀함수 = 반복 파트 + 종료 파트 (return)
 *
 * */

public class recursive {
    public static void main(String[] args) {
        f1(0); // 0 1 2 3 4
        f2(2); // 2 4 6 8 10
        f3(1); // 55
        for(int tc=1; tc<=10; tc++) {
            System.out.println("재귀함수의 합: " + f4(tc));
        }

        tot = 0;
        g(1, 0);
        System.out.println("tot: " + tot);
    }

    static int tot = 0;
    public static void g(int i, int sum) {
        if(i == 11) {
            tot = sum;
            return;
        }
        g(i+1, sum+i);
    }

    public static int f4(int i) {
        if(i == 1) {
            return 1;
        } else {
            return f4(i-1) + i;
        }
    }

    static int total = 0;
    public static void f3(int i) {
        if(i > 10) {
            System.out.println("total: " + total);
            return;
        } else {
            total += i;
            f3(i+1);
        }
    }

    public static void f2(int i) {
        if(i > 10) {
            System.out.println();
            return;
        } else {
            System.out.print(i + " ");
            f2(i + 2);
        }
    }

    public static void f1(int i) {
        if(i >= 5) { // 종료 파트
            System.out.println();
            return;
        } else { // 반복 파트
            System.out.print(i+ " ");
            f1(i + 1);
        }
    }

}