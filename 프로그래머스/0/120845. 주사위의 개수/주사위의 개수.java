class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int arr[] = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = box[i] / n;
            answer *= arr[i];
        }
        
        return answer;
    }
}