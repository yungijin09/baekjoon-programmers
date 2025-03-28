class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer = 12000*n + (k - n/10) * 2000 ;
        return answer;
    }
}