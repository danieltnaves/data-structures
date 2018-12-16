package binarysearch;

public class BinarySearchProblems {

    /**
     * Given a sorted (in ascending order) integer array nums of n elements and a target value,
     * write a function to search target in nums. If target exists, then return its index, otherwise return -1.
     *
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = Math.round((left + right) / 2);
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
