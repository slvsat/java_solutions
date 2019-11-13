package leetcode.medium;

public class EliminationGame_390 {
    public int lastRemaining(int n) {
        if(n == 1) return 1;
        if(n <= 3) return 2;
        if((n/2) % 2 == 1) {
            return 4*lastRemaining((n-2) / 4);
        }
        else {
            return 4*lastRemaining(n/4)-2;
        }
    }
}
