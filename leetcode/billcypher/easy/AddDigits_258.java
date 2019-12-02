package billcypher.easy;

public class AddDigits_258 {

    public int addDigits(int num) {
        while(num > 9) {
            int temp = 0;
            int tempNum = num;
            while(tempNum > 9) {
                int last = tempNum % 10;
                temp += last;
                tempNum = tempNum / 10;
            }
            temp += tempNum;
            num = temp;
        }
        return num;
    }

}
