package codesignal.stormspirit;

public class OneTech_vs_DAR_1 {

    public int specialPolynomial(int x, int n) {
        int d = 0;
        int k = 0;
        while (d <= n) {
            d = d + (int)Math.pow(x, k);
            k++;
        }
        return k - 1;
    }

}
