class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        // 문자열 길이가 4 혹은 6이니?
        if(!(s.length() == 4 || s.length() == 6)){
            return false;
        }
        
        // 그 배열이 숫자로만 구성되어있니?
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;        
            }        
        }
        
        return answer;
    }
}