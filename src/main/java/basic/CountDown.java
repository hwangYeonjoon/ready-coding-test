package basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountDown {
    //문제
//    public int[] solution(int start_num, int end_num) {
//        int[] answer = {};
//        return answer;
//    }
//    정수 start_num와 end_num가 주어질 때,
//    start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.


    public static void main(String[] args) {
        int start =10;
        int end = 3;
        CountDown solution = new CountDown();


        System.out.println("solution1 = " + Arrays.toString( solution.solutuion1(start,end)));
        System.out.println("solution2 = " + Arrays.toString( solution.solutuion2(start,end)));
        System.out.println("solution3 = " + Arrays.toString( solution.solutuion3(start,end)));
    }

    public int[] solutuion1(int start, int end) {
        int[] answer = new int[start - end + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start--;
        }

        return answer;
    }

    public int[] solutuion2(int start, int end) {
        return IntStream.rangeClosed(end,start).map(i -> start - (i - end)).toArray();
    }

    public int[] solutuion3(int start, int end) {
        return IntStream.iterate(start,i -> i-1 ).limit(start -end +1).toArray();
    }

}
