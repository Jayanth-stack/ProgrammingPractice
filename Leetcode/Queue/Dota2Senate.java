// Dota2 Senate
// Leetcode 394

package Leetcode.Queue;

import java.util.Deque;
import java.util.ArrayDeque;

class Dota2Senate{
    public String predictPartyVictory(String senate){
        int n = senate.length();
        Deque<Integer> radiant = new ArrayDeque<>();
        Deque<Integer> dire = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                radiant.add(i);
            }else{
                dire.add(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()){
            int r_index = radiant.poll();
            int d_index = dire.poll();
            if(r_index < d_index){
                radiant.add(r_index + n);
            }else{
                dire.add(d_index + n);
            }
        }

        return radiant.size() > dire.size() ? "Radiant" : "Dire";
    }
}