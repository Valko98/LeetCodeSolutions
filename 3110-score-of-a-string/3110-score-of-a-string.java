class Solution {
    public int scoreOfString(String s) {
        int counter = 0;
        for (int i = 1; i < s.length(); ++i) {
            counter += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }
        return counter;
        
    }
}