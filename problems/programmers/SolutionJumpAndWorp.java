package problems.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionJumpAndWorp {

    public int solution(int n){
        int current = 1;
        int dis = 1;
        int battery =1;

        while(current <= n){
            if((current + 1) * 2 == n){
                battery++;
                current = (current + 1)*2;
                break;
            }
            if(current+1 == n){
                current++;
                battery++;
                break;
            }
            current = dis *2;
            dis *= 2;
        }
        return battery;
    }
    public int check(int n ){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                queue.add(i);
            }
        }
    }
    public int solution2(int n){
        int current = 0; int battery = 0;
        int dis = 0;


    }
}
