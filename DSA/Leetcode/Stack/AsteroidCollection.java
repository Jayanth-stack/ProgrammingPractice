// You are given an integer array asteroids, where asteroids[i] represents the size of the ith asteroid. Some asteroids are destroyed by colliding with each other.
// Leetcode link: https://leetcode.com/problems/asteroid-collision/
// Leetcode Difficulty: Medium
// Leetcode 735. Asteroid Collision

package DSA.Leetcode.Stack;
import java.util.Stack;

public class AsteroidCollection {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(asteroids[i]);
                }else if(stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = stack.pop();
        }
        return res;
    }
    
}
