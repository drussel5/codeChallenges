import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grid {
    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        char[] tempArr;
        String tempVal;
        Map<Integer, String> sortedMap = new HashMap<Integer, String>();
        for (int i = 0; i < grid.size(); i++) {
            tempArr = grid.get(i).toCharArray();
            Arrays.sort(tempArr);
            for (int j = 0; j < tempArr.length; j++) {
                tempVal = sortedMap.putIfAbsent((Integer)j, ""+tempArr[j]);
                if (tempVal != null) {
                    sortedMap.replace((Integer)j, tempVal + tempArr[j]);
                }
            }
        }

        for (String col : sortedMap.values()) {
            tempArr = col.toCharArray();
            Arrays.sort(tempArr);
            tempVal = new String(tempArr);
            if (!tempVal.equals(col)) {
                return "NO";
            }
        }

        return "YES";
    }
}
