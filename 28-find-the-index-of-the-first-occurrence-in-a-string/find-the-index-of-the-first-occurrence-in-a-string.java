class Solution {
    public int strStr(String haystack, String needle) {
        haystack = haystack.toLowerCase();
        needle = needle.toLowerCase();

        int n = needle.length();
        int m = haystack.length();
        
        if(needle.isEmpty()){
            return 0;
        }
        if(n > m){
            return -1;
        }
        for(int i=0;i<=m-n;i++){

            if(haystack.substring(i, i+n).equals(needle)){
                return i;
            }

        }
        return -1;
    }
}