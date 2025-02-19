//Leetcode: 374. Guess Number Higher or Lower

package DSA.Leetcode.BinarySearch;

public class GuessHighorLower extends GuessGame {
    public int guessNumber(int n){
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == 1){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }

        return low;
    }
}

class GuessGame{
    public int guess(int num){
        return 0;
    }
}
