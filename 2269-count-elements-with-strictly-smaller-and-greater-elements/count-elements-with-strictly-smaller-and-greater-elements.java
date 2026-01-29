import java.util.*;
class Solution {
    public int countElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i:nums){
            if(i>max) max=i;
        }
        for(int i:nums){
            if(i<min)min=i;
        }
        for(int i:nums){
            if(i<max && i>min) count++;
        }
        return count;


    }
}