import problems.*;
import java.util.Collections;
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

        int [] arr= {9,1,9,2,12};
        SolutionSumNothingNum solutionSumNothingNum = new SolutionSumNothingNum();
        //System.out.println(solutionSumNothingNum.solution(arr));

        SolutionCollatz collatz = new SolutionCollatz();
        //System.out.println(collatz.solution(626331));

        //int division = 5;
        //int temp[] ={10,5,7,2};
        SolutionDiv div = new SolutionDiv();
        //System.out.println(div.solution(temp,division));
        String num = "01033457681";
        SolutionHideNum hideNum = new SolutionHideNum();
        //System.out.println(hideNum.solution(num));

        int arr2[] = {10};
        SolutionMinDelete minDelete = new SolutionMinDelete();
        System.out.println(minDelete.solution2(arr2));

        String s2 = "qwer";
        SolutionMidChar mid = new SolutionMidChar();
        //System.out.println(mid.solution(s2));

        SolutionWm wn = new SolutionWm();
        //System.out.println(wn.solution(6));

        SolutionRefeatWord rw = new SolutionRefeatWord();
        //System.out.println(rw.solution("hello",3));

        SolutionAnt ant = new SolutionAnt();
        //System.out.println(ant.solution(24));

        int nums[] = {3,3,3,2,2,4};
        SolutionPhoneKetmon phoneKetmon = new SolutionPhoneKetmon();
        //System.out.println(phoneKetmon.solution(nums));

        String phone_book[] = {"3345, 7681, 010, "};
        SolutionPhoneNumsList phoneNumsList = new SolutionPhoneNumsList();
        //System.out.println(phoneNumsList.solution2(phone_book));

        String com []={	"stanko", "ana", "mislav"};
        String parti[] = {"mislav", "stanko", "mislav", "ana"};
        SolutionNotCompletion nc = new SolutionNotCompletion();
        //System.out.println(nc.solution2(parti,com));

        String [][]clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        SolutionClothes sc = new SolutionClothes();
        //System.out.println(sc.solution(clothes));

        String [] genres = {"classic", "pop", "classic", "classic", "pop"};
        int [] plays = {500, 600, 150, 800, 2500};
        SolutionBestAlbum ba = new SolutionBestAlbum();
        //System.out.println(ba.solution2(genres, plays));

       /*int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int [] array ={1, 5, 2, 6, 3, 7, 4};
        SolutionKNum kNum = new SolutionKNum();
        System.out.println(kNum.solution(array, commands));*/

        int temp [] = {3, 30, 34, 5, 9};
        SolutionMaxNum maxNum = new SolutionMaxNum();
        //System.out.println(maxNum.solution(temp));

        int citatiotn [] = {3, 5, 11, 6, 1, 5, 3, 3, 1, 41};
        SolutionHindex hIdx = new SolutionHindex();
        //System.out.println(hIdx.solution(citatiotn));

        int numbers [] = {4,1,2,1};
        int target = 5;
        SolutionTargetNum targetNum = new SolutionTargetNum();
        // System.out.println(targetNum.solution(numbers, target));
        //System.out.println(targetNum.solutionBfs(numbers,target));

        int maps [][] ={{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        SolutionRorgame rorgame = new SolutionRorgame();
        //System.out.println(rorgame.solution(maps));

        SolutionMaxMin maxMin = new SolutionMaxMin();
        //System.out.println(maxMin.solution("1 2 -3 4"));

        SolutionCheckBracket checkBracket = new SolutionCheckBracket();
        //System.out.println(checkBracket.solutionCnt("())(()"));

        SolutionJadenCase jadenCase = new SolutionJadenCase();
        //System.out.println(jadenCase.solution("hello world   wo "));

        SolutionChangeBinary changeBinary = new SolutionChangeBinary();
        //System.out.println(changeBinary.solution("110010101001"));
        //changeBinary.solution("110010101001");

        SolutionAsNum asNum = new SolutionAsNum();
        //System.out.println(asNum.solution(15));

        SolutionNextMax nextMax = new SolutionNextMax();
        //System.out.println(nextMax.solution2(78));
        
        SolutionFibo fibo = new SolutionFibo();
        //System.out.println(fibo.solution(45));
       // System.out.println(fibo.solution2(45));

        SolutionRemovePairStr removePairStr = new SolutionRemovePairStr();
        //System.out.println(removePairStr.solution("caaaac"));

        SolutionCarpet carpet = new SolutionCarpet();
        //System.out.println(carpet.solution(8,1));

        SolutionJumpAndWorp jumpAndWorp = new SolutionJumpAndWorp();
        //System.out.println(jumpAndWorp.solution2(5000));

        int [] people = {65, 60, 36, 30};
        int limit = 100;
        SolutionEmergencyBoat emergencyBoat = new SolutionEmergencyBoat();
        //System.out.println(emergencyBoat.solution(people, limit));
        System.out.println(emergencyBoat.solution2(people,limit));
        SolutionGymSuit gym = new SolutionGymSuit();
        //System.out.println(gym.solution());
    }
}