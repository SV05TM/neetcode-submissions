class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue; // skip words already grouped

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            char[] word1 = strs[i].toCharArray();
            Arrays.sort(word1);

            for (int k = i + 1; k < strs.length; k++) {
                if (visited[k]) continue;

                char[] word2 = strs[k].toCharArray();
                Arrays.sort(word2);

                if (Arrays.equals(word1, word2)) {
                    group.add(strs[k]);
                    visited[k] = true;
                }
            }

            result.add(group);
        }

        return result;
    }
}
