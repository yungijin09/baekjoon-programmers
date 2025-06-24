class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int min = a - b;
        if(a % 2 == 1 && b % 2 == 1){
            answer = a * a + b * b;
        }else if(a % 2 == 0 && b % 2 == 0){
            if(min < 0)
                answer = -1 * min;
            else
                answer = min;
        }else{
            if(a < 0 && b > 0){
                answer = -1 * a - b;
            }else if(a < 0 && b < 0){
                answer = -1*(a - b);
            }else if(b < 0 && a > 0)
                answer = -1 * b - a;
             answer = 2 * (a + b);
        }
        return answer;
    }
}