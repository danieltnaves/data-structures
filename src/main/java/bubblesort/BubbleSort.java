package bubblesort;

public class BubbleSort {


    /**
     * This is a Bubble sort algorithm with O(N^2) complexity
     * @param nums
     */
    public static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        return nums;
    }

}
