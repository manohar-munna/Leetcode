class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];
        int count = 0;

        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int fre = 1;
        int i = 25;
        while(fre <= 8 && i >= 0){
            while(freq[i] > 0){
                count++;
                freq[i]--;
            }
                fre++;
            i--;
        }
        while(fre <= 16 && i >= 0){
            while(freq[i] > 0){
                count += 2;
                freq[i]--;
            }
                fre++;
            i--;
        }
        while(fre <= 24 && i >= 0){
            while(freq[i] > 0){
                count += 3;
                freq[i]--;
            }
                fre++;
            i--;
        }
        while(fre <= 26 && i >= 0){
            while(freq[i] > 0){
                count += 4;
                freq[i]--;
            }
                fre++;
            i--;
        }
        return count;
    }
}