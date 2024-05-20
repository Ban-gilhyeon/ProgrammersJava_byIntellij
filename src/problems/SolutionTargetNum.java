package problems;
public class SolutionTargetNum {
    int answer;
    int [] numbers;
    int target;
    public void dfs(int index, int sum){
        //탈출
        if(index == numbers.length){
            if(sum == target) answer ++;
            return;
        }
        //수행
        dfs(index+1,sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);

    }
    public int solution(int [] numbers, int target){
        this.numbers = numbers;
        this.target = target;
        dfs(0,0);

        return answer;
    }

    public int f(int n ){

        if(n <= 0) return 0;
        if(n <= 3) return n;

        return f(n-2)+f(n-3);
    }
}
