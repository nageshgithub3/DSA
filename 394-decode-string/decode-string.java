class Solution {
    public String decodeString(String s) {
        Stack<Integer> cs = new Stack<>();
        Stack<String> ss = new Stack<>();
        String currStr = "";
        int currNum = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                currNum =currNum * 10 + (ch - '0');
            }
            else if (ch == '['){
                cs.push(currNum);
                ss.push(currStr);
                currNum = 0;
                currStr = "";
            }else if (ch == ']'){
                int rtTimes = cs.pop();
                String prev = ss.pop();
                StringBuilder temp = new StringBuilder(prev);
                for (int i = 0; i < rtTimes; i++) {
                    temp.append(currStr);
                }
                currStr = temp.toString();
            }else{
                 currStr += ch;
            }
        }
        return currStr;
        
    }
}