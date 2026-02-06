import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;
        Integer[] indices = new Integer[n];

        // Store indices
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices by heights (descending)
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return heights[b] - heights[a];
            }
        });

        // Build result
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[indices[i]];
        }

        return result;
    }
}
