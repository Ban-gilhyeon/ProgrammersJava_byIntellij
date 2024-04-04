import problems.*;


public class Main {
    public static void main(String[] args) {
        String s = "pPoooyY";
        SolutionCntPY solutionCntPY = new SolutionCntPY();
        //System.out.println(solutionCntPY.solution(s));

        long n = 124123154;
        SolutionReverse solutionReverse = new SolutionReverse();
        //System.out.println(solutionReverse.debugging(n));
        int a = 121;
        SolutionSqare solutionSqare = new SolutionSqare();
        //System.out.println(solutionSqare.solution(a));

        SolutionSort solutionSort = new SolutionSort();
        //System.out.println(solutionSort.solution(n));

        SolutionHoshade solutionHoshade = new SolutionHoshade();
        //System.out.println(solutionHoshade.solution(19));

        String seoul[] ={"Jane", "Kim"};
        SolutionFindKim solutionFindKim =  new SolutionFindKim();
        //System.out.println(solutionFindKim.solution(seoul));

        int [] arr= {9,1,9,2,0};
        SolutionSumNothingNum solutionSumNothingNum = new SolutionSumNothingNum();
        //System.out.println(solutionSumNothingNum.solution(arr));

        SolutionCollatz collatz = new SolutionCollatz();
        System.out.println(collatz.solution(626331));
    }
}