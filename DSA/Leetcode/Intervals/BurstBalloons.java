//Leetcode: Burst Balloons 452

// Level: Medium
package DSA.Leetcode.Intervals;
import java.util.*;

public class BurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int arrow = points[0][1];
        for(int i = 1; i < points.length; i++){
            if(arrow >= points[i][0]) continue;
            count++;
            arrow = points[i][1];
        }
        return count;
    }
}
