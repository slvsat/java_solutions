import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // System.out.println(romanToInt("MCMXCIV"));
//        System.out.println(isValid(""));
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid("([)]"));
//        System.out.println(isValid("{[]}"));
//        System.out.println(isValid("]"));
//        System.out.println(isValid("["));
//        int[] nums = new int[]{1, 1, 2};
//        System.out.println(removeDuplicates(nums));

//        int[] given = new int[]{3,2,2,3};
//        System.out.println(removeElement(given, 3));
//        System.out.println(Arrays.toString(given));

//        System.out.println(strStr("hello", "ll"));
//        System.out.println(strStr("hello", ""));
//        System.out.println(strStr("aaaaa", "a"));

//        int[] nums = new int[]{1,3,5,6};
//        System.out.println(searchInsert(nums, 2));
    }

    public static int romanToInt(String s) {
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

    public static boolean isValid(String s) {
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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

    public static int removeDuplicates(int[] nums) {
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

    public static int removeElement(int[] nums, int val) {
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

    public static int strStr(String haystack, String needle) {
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

    public static int searchInsert(int[] nums, int target) {
        int shouldBe = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] < target) {
                shouldBe = i+1;
            }
        }
        return shouldBe;
    }
}