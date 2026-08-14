class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> holder = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++){
            holder.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(holder.containsKey(diff) && holder.get(diff) != i){
                return new int[]{i, holder.get(diff)};
            }
        }

        return new int[0];
    }
}