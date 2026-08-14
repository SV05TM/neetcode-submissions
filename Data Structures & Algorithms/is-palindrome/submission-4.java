class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int i = 0;
        int end = lower.length() - 1;

        while (i < end){
            if (!Character.isLetterOrDigit(lower.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(lower.charAt(end))){
                end--;
                continue;
            }
            if (lower.charAt(i) != lower.charAt(end)){
                return false;
            }
            i++;
            end--;
        }
        return true;
        
    }
}
