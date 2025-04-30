class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
            for(int i = 1;i <= slice; i++){
                if(n % slice ==0){
                    answer = n / slice;
                }else{
                    answer = (n + i) / slice;
                }
            }    
            return answer;
    }
}