package codeforces;

import java.util.*;

public class CubesSorting {
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
            boolean res = false;
            while (k < form) {
                for (int a = 0; a < d-1; a++) {
                    if (arr[a] > arr[a+1]) {
                        int temp = arr[a];
                        arr[a] = arr[a+1];
                        arr[a+1] = temp;
                        k++;
                    }
                    if (k > form) break;
                }
                for (int e = 0; e < d-1; e++) {
                    if (arr[e] > arr[e+1]) {
                        break;
                    }
                    if (e+1 == d-1) {
                        res = true;
                        k = form+1;
                        break;
                    }
                }
            }
            if (!res) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        in.close();
    }
}