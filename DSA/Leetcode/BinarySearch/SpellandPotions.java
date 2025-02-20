
// Leetcode 2300. Spell and Potions
// https://leetcode.com/discuss/interview-question/2300/Amazon-Online-Assessment-Questions

package DSA.Leetcode.BinarySearch;

public class SpellandPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success){
        int[] result = new int[2];
        int left = 0;
        int right = potions.length -1;
        int count = 0;
        while(left < spells.length && right >= 0){
            long sum = spells[left] + potions[right];
            if(sum > success){
                right--;
            }else{
                count += right + 1;
                left++;
            }
        }
        result[0] = count;
        result[1] = left;
        return result;
    }

}
