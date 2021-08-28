package com.example.mba.aula3;

public class Solution {

    public void twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            for(int y = i + 1; y < arr.length; y++){
                if(arr[i] + arr[y] == 16){
                    System.out.println(arr[i] + ", "  +arr[y] );
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
