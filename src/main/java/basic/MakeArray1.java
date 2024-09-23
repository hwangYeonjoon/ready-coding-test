package basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArray1 {

    //문제
//    class Solution {
//        public int[] solution(int n, int k) {
//            int[] answer = {};
//            return answer;
//        }
//    }

//정수 n과 k가 주어졌을 때,
// 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

   //ex int = 10 , int k = 3 , result= [3,6,9]


    //설명

    public static void main(String[] args) {

        int n =10;
        int k=3;

        MakeArray1 solutuin  = new MakeArray1();

        System.out.println("solutuin1 = " + Arrays.toString(solutuin.soulution1(n,k)));
        System.out.println("solutuin2 = " + Arrays.toString(solutuin.soulution2(n,k)));
        System.out.println("solutuin3 = " + Arrays.toString(solutuin.soulution3(n,k)));

    }

    public int[] soulution1(int n ,int k){
        int[] answer = new int[n/k];
        for (int i = 1; i <= n/k; i++){
            answer[i -1] = k *i;
        }
        return answer;
    }


    public int[] soulution2(int n ,int k){
        return IntStream.rangeClosed(1,n).filter(i -> i % k == 0).toArray();
    }

    public int[] soulution3(int n ,int k){
        return IntStream.rangeClosed(1,n/k).map(i -> i*k).toArray();
    }



}
