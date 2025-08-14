class Solution {
    public String makeGood(String s) {
        char[] a = s.toCharArray();
        int t = -1; 
        for (char ch : a) {
            if (t >= 0 && Math.abs(a[t] - ch) == 32) {
                t--;           
            } else {
                a[++t] = ch;  
            }
        }
        return new String(a, 0, t + 1);
        
    }
}