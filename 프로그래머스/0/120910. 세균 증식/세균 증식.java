
class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int mul = 2;
        for(int i = 1; i < t; i++){
            mul *= 2;
        }
        answer = n * mul;
        return answer;
    }
}