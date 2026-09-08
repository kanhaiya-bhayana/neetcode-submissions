class Solution {
    public boolean isPalindrome(String input) {
        if (input.isEmpty()) return false;

        String s = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0, j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
