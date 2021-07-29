package com.search;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 < nums[i], target < 104
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 */


public class BinarySearch {

    public static int search(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len-1;

        for(int i=0;i<=len/2;i++)
        {
            if(nums[start]==target){
                return start;
            }

            if (nums[end] == target) {
                return end;
            }

            int mid = (start+end)/2;

            if(target == nums[mid]){
                return mid;
            }

            if(target < nums[mid]){
                end = mid;
            } else {
                start = mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[] {-1,0,3,5,9,12}, 2));
    }
}
