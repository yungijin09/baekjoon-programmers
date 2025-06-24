class Solution {
    public String solution(int n) {
        String answer = "";
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            if(i % 2 == 1)
                str[i] = "박";
            else
                str[i] = "수";
            answer += str[i];
        }
        return answer;
    }
}