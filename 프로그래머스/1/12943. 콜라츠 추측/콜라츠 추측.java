class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        while(num != 1){
            if(cnt == 500){
                answer = -1;
                return answer;
            }
            else if(num % 2 == 0){
                num /= 2;
            }else if(num % 2 == 1)
                num = num * 3 + 1;
            cnt++;
            if(num == 1)
                break;
            
        }
        if(num != 1)
            answer = -1;
        else{
            answer = cnt;
        }
        return answer;
    }
}