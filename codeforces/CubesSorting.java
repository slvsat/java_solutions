package codeforces;

import java.util.*;

public class A {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i < n; i++) {
            int d = in.nextInt();
            int form = (d * (d - 1)/2) - 1;
            int []arr = new int[d];
            for (int j = 0; j < d; j++) {
                arr[j] = in.nextInt();
            }
            int k = 0;
            while (form != k) {
                for (int a = 1; a < d-1; a++) {
                    if (arr[a-1] < arr[a]) {
                        int temp = arr[a];
                        arr[a] = arr[a-1];
                        arr[a-1] = temp;
                        k++;
                    }
                    if (form == k) {
                        for (int b = 0; b < d; b++) {
                            if (arr[b] > arr[b+1]) {
                                System.out.println("NO");
                            }
                        }
                        System.out.println("YES");
                    }
                }
            }
            System.out.println("NO");
        }
        in.close();
    }
}