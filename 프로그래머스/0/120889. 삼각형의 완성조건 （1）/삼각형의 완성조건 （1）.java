class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int temp = 0;
        for(int i = 0; i < sides.length; i++){
            if(sides[i] > max)
                max = sides[i];
        }
        for(int i = 0; i < sides.length; i++){
            temp += sides[i];
        }
        if(temp - max > max)
            answer = 1;
        else
            answer = 2;
        return answer;
    }
}