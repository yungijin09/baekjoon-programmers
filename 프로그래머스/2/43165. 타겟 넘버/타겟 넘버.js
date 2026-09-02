function solution(numbers, target) {
    var answer = 0;
    let ch = Array.from({length : numbers.length+1}, () => 0)
    const d = (n) => {
        if(n === numbers.length+1){
            let temp = 0;
            for(i = 1; i <= numbers.length+1; i++){
                if(ch[i] === 1){
                    temp += numbers[i-1]
                }
                else if(ch[i] === 0){
                    temp -= numbers[i-1]
                }
            }
            if(temp === target){
                answer++;
            }
            return;
        }
        else{
            ch[n] = 1;
            d(n+1)
            ch[n] = 0;
            d(n+1)
        }
    }
    d(1)
    return answer;
}