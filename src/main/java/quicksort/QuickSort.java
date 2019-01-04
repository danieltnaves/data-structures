package quicksort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    /**
     * This is a Quick Sort algorithm with [O(n log n) -> average,  O(n^2) -> worst]  complexity
     *
     * @param nums
     * @return
     */
    public static List<Integer> sort(List<Integer> nums) {

        //empty arrays and one element arrays are already sorted
        if (nums.size() < 2) {
            return nums;
        }

        // select a pivot
        Integer pivot = nums.get(0);

        // get the elements less than pivot
        List<Integer> less = nums.stream().skip(1).filter(k -> k <= pivot).collect(Collectors.toList()); //does not consider pivot skip(1)

        // get the elements greater than pivot
        List<Integer> greater = nums.stream().skip(1).filter(k -> k > pivot).collect(Collectors.toList()); //does not consider pivot skip(1)

        return Stream.concat(Stream.concat(sort(less).stream(), Stream.of(pivot)), sort(greater).stream())
                .collect(Collectors.toList()); //less than pivot + pivot + greater than pivot

    }

}
