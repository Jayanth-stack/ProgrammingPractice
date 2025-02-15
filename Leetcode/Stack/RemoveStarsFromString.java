// Remove consecutive stars from the string
// Leetcode 2340. Remove Consecutive Characters

package Leetcode.Stack;

import java.util.Stack;

public class RemoveStarsFromString {
    public String removeStars(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
           if(c == '*'){
               stack.pop();
            }else{
                stack.push(c);
           }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    
}
