import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        testing();
    }

    public static void testing() {
//        int[] digits = new int[]{1, 2, 3};
//        System.out.println(Arrays.toString(plusOne(digits)));

//        System.out.println(addBinary("10101", "1011"));

//        System.out.println(mySqrt(4));
//        System.out.println(mySqrt(8));
//        System.out.println(8/3);

//        int[] a = new int[]{-1,2,2,-5,0,-1,4};
//        System.out.println(fourSum(a, 3));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        if (digits.length != 0 && digits[0] != 0) return digits;

        int[] result = new int[digits.length + 1];
        result[0]++;
        return result;
    }

    public static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int f = 0;
        int s = 0;
        while(i >= 0 || j >= 0) {
             f = j < 0 ? 0 : b.charAt(j) - '0';
             s = i < 0 ? 0 : a.charAt(i) - '0';
             result.insert(0, (f + s + carry) % 2);
             carry = (f + s + carry) / 2;
             i--;
             j--;
        }
        if (carry != 0) {
            result.insert(0, '1');
        }
        return result.toString();
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i+1; j < nums.length - 2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    int x = (nums[i] + nums[j] + nums[k] + nums[l]);
                    if (x > target) {
                        l--;
                    } else if (x < target) {
                        k++;
                    } else {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        result.add(temp);
                        while(k < l && nums[k+1] == nums[k]) k++;
                        while(k < l && nums[l] == nums[l-1]) l--;
                        l--;
                        k++;
                    }
                }
            }
        }
        return result;
    }

    public static int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length-1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public static DoneProblems.ListNode deleteDuplicates(DoneProblems.ListNode head) {
        DoneProblems.ListNode p = new DoneProblems.ListNode(0);
        p.next = head;
        if (head == null) return p.next;
        DoneProblems.ListNode temp = new DoneProblems.ListNode(0);
        if (head.next != null) temp = head;
        while(temp.next != null) {
            if (temp.val == temp.next.val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return p.next;
    }
}