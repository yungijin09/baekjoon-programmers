class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        int div = x;
        while(div > 0)
        {
            num += div % 10;
            div /= 10;
        }
        
        if(x % num == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}