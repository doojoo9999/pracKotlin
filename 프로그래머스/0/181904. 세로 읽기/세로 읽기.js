function solution(my_string, m, c) {
    let answer = [];
    const length = my_string.length;
    
    for (let i = c - 1; i < length; i += m) {
        answer.push(my_string[i]);
    }
    
    return answer.join('');
}