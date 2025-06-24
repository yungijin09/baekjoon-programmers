class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String n1 = (a +""+ b);
        String n2 = (b +""+ a);
        
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        if(num1 > num2)
            answer = num1;
        else if(num1 == num2)
            answer = num1;
        else
            answer = num2;
        return answer;
    }
}