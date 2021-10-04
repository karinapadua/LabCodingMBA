package com.example.mba.aula3;

import java.util.Arrays;

public class Solution {

    public void twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int y = i + 1; y < nums.length; y++){
                if(nums[i] + nums[y] == target){
                    System.out.println(nums[i] + ", " + nums[y] );
                    return;
                }
            }
        }

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int array[] = { 3, 2, 4} ;
        solution.twoSum(array, 6);
    }

}
