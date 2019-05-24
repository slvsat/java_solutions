package leetcode;

public class CountPrimes_204 {

    // Actual solve for this problem is Sieve of Eratosthenes

    // This solution is 567 ms which is too long

    public int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            System.out.println(i + " is " + checkIfPrime(i));
            if (checkIfPrime(i)) cnt++;
        }
        return cnt;
    }

    private boolean checkIfPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
