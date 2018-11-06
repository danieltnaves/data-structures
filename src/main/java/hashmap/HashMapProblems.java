package hashmap;

import javafx.util.Pair;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class HashMapProblems {

    /*
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    /*
     * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of
     * favorite restaurants represented by strings.
     * ou need to help them find out their common interest with the least list index sum. If there is a choice tie
      * between answers, output all of them with no order requirement. You could assume there always exists an answer.
     */
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> list2Set = new HashMap<>();
        Map<String, Integer> results = new HashMap<>();

        AtomicInteger min = new AtomicInteger(Integer.MAX_VALUE);

        IntStream.range(0, list2.length)
                 .forEach(index -> list2Set.put(list2[index], index));

        IntStream.range(0, list1.length)
                 .forEach(i -> {
                     if (list2Set.containsKey(list1[i])) {
                         int val = i + list2Set.get(list1[i]);
                         min.set(Math.min(min.get(), val));
                         results.put(list1[i], val);
                     }
                 });

        List<String> finalResults = new ArrayList<>();
        results.entrySet().forEach(k -> {
            if (k.getValue() == min.get()) {
                finalResults.add(k.getKey());
            }
        });
        return finalResults.toArray(new String[finalResults.size()]);
    }

    /*
     * Given a string, find the first non-repeating character in it and return it's index.
     * If it doesn't exist, return -1.
     */
    public int firstUniqChar(String s) {

        Map<Character, Pair<Integer, Integer>> results = new LinkedHashMap<>();
        char[] cArray = s.toCharArray();

        IntStream.range(0, s.length())
                .forEach(i -> {
                    if (results.containsKey(cArray[i])) {
                        results.put(cArray[i], new Pair<>(i, results.get(cArray[i]).getValue() + 1));
                    } else {
                        results.put(cArray[i], new Pair<>(i, 1));
                    }
                });

        if (results.size() > 0) {
            Optional<Map.Entry<Character, Pair<Integer, Integer>>> entry = results.entrySet()
                    .stream()
                    .filter(k -> k.getValue().getValue() == 1)
                    .findFirst();
            return entry.isPresent() ? entry.get().getValue().getKey() : -1;
        }

        return -1;
    }
}
