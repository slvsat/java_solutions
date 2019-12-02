package billcypher.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] arr = new int[nums.length+1];
        for(int n: nums){
            arr[n]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1; i< arr.length; i++){
            if(arr[i] == 0) res.add(i);
        }

        return res;

    }

}
