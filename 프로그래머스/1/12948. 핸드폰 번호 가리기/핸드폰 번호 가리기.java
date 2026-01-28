class Solution {
    public String solution(String num) {
        StringBuilder sb = new StringBuilder();
        int len = num.length();
        
        for(int i = 0; i<len-4; i++){
            sb.append("*");
        }
        
        sb.append(num.substring(len-4));
        
        return sb.toString();
    }
}