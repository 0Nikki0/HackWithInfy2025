import java.util.Arrays;
import java.util.Comparator;

public class Problem2_MaximumLengthOfPairChain {
    public static void main(String[] args) {
        int[][] pairs = {{1,2}, {2,3}, {3,4}};
        System.out.println(findLongestChain(pairs));
    }

    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        int[] prev = pairs[0];
        int cnt = 1;

        for(int i = 0; i < pairs.length; i++) {
            int[] curr = pairs[i];
            if(prev[1]<curr[0]) {
                cnt++;
                prev = curr;
            }
        }
        return cnt;
    }
}