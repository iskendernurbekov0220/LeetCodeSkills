class Solution {
    // Nurbekov Iskender
    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;
        String s = String.valueOf(x);
        int leftIndex = 0;
        int rightIndex = s.length()-1;
        while(leftIndex<=rightIndex){
            if  (s.charAt(leftIndex)!=s.charAt(rightIndex)){
                isPalindrome = false;
            }
            leftIndex++;
            rightIndex--;
        }
        return isPalindrome;
    }
}