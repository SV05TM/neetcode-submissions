class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        
        for (int i : nums){
            hash.add(i);
        }

        int longest = 0;

        for (int i : hash){
            if (!hash.contains(i - 1)){
                int leng = 1;
                while(hash.contains(i + leng)){
                    leng++;
                }
                longest = Math.max(longest, leng);
            }
        }
        return longest;

    }
}
