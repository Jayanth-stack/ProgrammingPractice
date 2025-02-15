// You are given two strings word1 and word2. You must perform the following operation any number of times:
//Leetcode Problem: 1657. Determine if Two Strings Are Close

package Leetcode.HashMap;

import java.util.Arrays;
import java.util.Set;

public class CloseString {

    public boolean closeStrings(String word1, String word2){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        Set<Character> set1 = new java.util.HashSet<>();
        Set<Character> set2 = new java.util.HashSet<>();

        for(char c : word1.toCharArray()){
            freq1[c - 'a']++;
            set1.add(c);
        }
        for(char c : word2.toCharArray()){
            freq2[c - 'a']++;
            set2.add(c);
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return set1.equals(set2) && Arrays.equals(freq1, freq2);
    }
    
}
