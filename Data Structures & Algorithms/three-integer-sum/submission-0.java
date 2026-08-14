class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // checks if nums is empty or does not have triple indices
        if (nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        // sorts and creates return list
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < nums.length -2; i++){
            // creates two pointer
            // has 3 points, i , (i + 1), (nums.length - 1)
            int left = i + 1;
            int right = nums.length - 1;
            // loops until all indices are found
            while(left < right){
                // checks solutions
                int sum = nums[i] + nums[left] + nums[right];
                // if 0 then saves
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                // if sum is less than 0 we move onto a bigger left number
                else if (sum < 0){
                    left++;
                }
                else{
                    // if more than 0 we move onto smaller right number
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
        
    }
}
