import java.util.ArrayList;
import java.util.List;

public class PaskalsTriangle2_119 {

    public List<Integer> getRow(int rowIndex) {
        long C = 1;
        List<Integer> result = new ArrayList<>();
        for (int j = 1; j <= (rowIndex + 1); j++) {
            result.add((int)C);
            C = C * ((rowIndex+1) - j) / j;
        }
        return result;
    }

}
