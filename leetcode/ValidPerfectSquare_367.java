package leetcode;

public class ValidPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        if(num<=1)
            return true;
        long start =0;
        long end = num;
        while(start+1<end){
            long mid = (start+end)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid<num){
                start = mid;
            }
            else{
                end =mid;
            }
        }

        if(end*end==num )
            return true;
        else if(start*start ==num )
            return true;
        else
            return false;
    }
}
