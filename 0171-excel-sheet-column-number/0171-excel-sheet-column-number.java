class Solution {
    public int titleToNumber(String col) {
        int ans = 0;
        int j = 0;
        for(int i=col.length()-1; i>= 0; i--){
            ans +=  ( (int)col.charAt(i) - (int)'A' + 1) * (Math.pow(26, j++));
        }
        return ans;
    }
}