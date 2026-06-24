class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];
        for(char c : allowed.toCharArray()){
            arr[c - 'a'] = true;;
        }
        int count = 0;
        for(String s : words){
            boolean yes = true;
            boolean[] str = new boolean[26];
            for(char c : s.toCharArray()){
                str[c - 'a'] = true;
            }
            for(int i=0; i<26; i++){
                if(arr[i] == false && str[i] == true){
                    yes = false; break;
                }
            }
            if(yes){
                count++;
            }
        }
        return count;
    }
}