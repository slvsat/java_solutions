import java.util.*;

public class DoneProblems {

//    System.out.println(romanToInt("MCMXCIV"));
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumber = new HashMap<Character, Integer>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M',1000);

        int number = 0;

        for (int i=0; i<s.length(); i++) {
            if (i+1 != s.length()) {
                if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                    number += 4;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                    number += 40;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                    number += 9;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                    number += 90;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                    number += 400;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                    number += 900;
                    i++;
                    continue;
                }
            }
            number += romanNumber.get(s.charAt(i));
        }
        return number;
    }

//    System.out.println(isValid(""));
//    System.out.println(isValid("()[]{}"));
//    System.out.println(isValid("(]"));
//    System.out.println(isValid("([)]"));
//    System.out.println(isValid("{[]}"));
//    System.out.println(isValid("]"));
//    System.out.println(isValid("["));
    public boolean isValid(String s) {
        Stack<Character> closing = new Stack<>();
        if (s.length() == 0) return true;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '{') {
                closing.add('}');
            } else if (s.charAt(i) == '(') {
                closing.add(')');
            } else if (s.charAt(i) == '[') {
                closing.add(']');
            } else {
                if (!closing.isEmpty()) {
                    if (s.charAt(i) == closing.pop()) continue;
                    else return false;
                } else return false;
            }
        }
        return closing.isEmpty();
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                if(l1.val < l2.val){
                    p.next = l1;
                    l1=l1.next;
                }else{
                    p.next=l2;
                    l2=l2.next;
                }
                p = p.next;
            }else if(l1==null){
                p.next = l2;
                break;
            }else if(l2==null){
                p.next = l1;
                break;
            }
        }

        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//    int[] nums = new int[]{1, 1, 2};
//    System.out.println(removeDuplicates(nums));
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

//    int[] given = new int[]{3,2,2,3};
//    System.out.println(removeElement(given, 3));
//    System.out.println(Arrays.toString(given));
    public int removeElement(int[] nums, int val) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                for (int j=i; j<nums.length; j++) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                count++;
                continue;
            }
            break;
        }
        return count;
    }

//    System.out.println(strStr("hello", "ll"));
//    System.out.println(strStr("hello", ""));
//    System.out.println(strStr("aaaaa", "a"));
    public int strStr(String haystack, String needle) {
        if (needle.length() <= 0) return 0;
        else if (needle.length() > haystack.length()) return -1;
        else if (haystack.equals(needle)) return 0;
        boolean isPart = false;
        int index = -1;
        for (int i=0; i<haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i >= needle.length()) {
                    for (int j=0; j<needle.length(); j++) {
                        if (haystack.charAt(i+j) == needle.charAt(j)) {
                            if (j == needle.length()-1) {
                                isPart = true;
                                index = i;
                                break;
                            }
                            continue;
                        }
                        break;
                    }
                }
            }
            if (isPart) {
                break;
            }
        }
        return index;
    }

//        int[] nums = new int[]{1,3,5,6};
//        System.out.println(searchInsert(nums, 2));
    public int searchInsert(int[] nums, int target) {
        int shouldBe = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] < target) {
                shouldBe = i+1;
            }
        }
        return shouldBe;
    }

//        char[] s = new char[]{'H','a','n','n','a','h'};
//        reverseString(s);
//        System.out.println(s);
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }

//        System.out.println(countAndSay(6));
    public String countAndSay(int n) {
        if (n < 1 || n > 30) return "";
        if (n == 1) return "1";

        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;

            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                sb.append(count);
                sb.append(s.charAt(i));
                count = 0;
            }
        }

        return sb.toString();
    }

    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int low = 0;
        int sum = 0;

        while(low < nums.length){
            sum += nums[low];
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
            low++;
        }

        return max;
    }

//        System.out.println(lengthOfLastWord(""));
    public int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        if (splited.length >= 1) return splited[splited.length - 1].length();
        return 0;
    }

//        int[] digits = new int[]{1, 2, 3};
//        System.out.println(Arrays.toString(plusOne(digits)));
    public int[] plusOne(int[] digits) {
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

//        System.out.println(addBinary("10101", "1011"));
    public String addBinary(String a, String b) {
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

//        int[] a = new int[]{-1,2,2,-5,0,-1,4};
//        System.out.println(fourSum(a, 3));
    public List<List<Integer>> fourSum(int[] nums, int target) {
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

//        System.out.println(mySqrt(4));
//        System.out.println(mySqrt(8));
//        System.out.println(8/3);
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    public int climbStairs(int n) {
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = new ListNode(0);
        p.next = head;
        if (head == null) return p.next;
        ListNode temp = new ListNode(0);
        if (head.next != null) temp = head;
        while(temp.next != null) {
            if (temp.val == temp.next.val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return p.next;
    }


    // 88
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) nums1[k--]= (nums1[i]>nums2[j]) ? nums1[i--] : nums2[j--];
        while (j>-1)         nums1[k--]=nums2[j--];
    }

    // 100
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) return false;
        }
        else if (p != null && q == null) return false;
        else if (p == null && q != null) return false;
        else if (p == null && q == null) return true;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // Less code -->
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null || q == null) return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // 101
    public static boolean isSymmetric(DoneProblems.TreeNode root) {
        if (root == null) return true;
        return isEqual(root.left, root.right);
    }

    public static boolean isEqual(DoneProblems.TreeNode a, DoneProblems.TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
        return isEqual(a.left, b.right) && isEqual(a.right, b.left);
    }
}
