package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetProblems {

    /*
     * Given an array of integers, find if the array contains any duplicates.
     * Your function should return true if any value appears at least twice in the array,
     * and it should return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    /*
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        return set.stream().findFirst().get();
    }

    /*
     * Given two arrays, write a function to compute their intersection.
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }

}
