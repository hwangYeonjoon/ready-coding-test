package basic;

public class DependonFlag {
    //문제
//    class Solution {
//        public int solution(int a, int b, boolean flag) {
//            int answer = 0;
//            return answer;
//        }
//    }
// 설명
//    두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
//    flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요

    // 예시 a = -4 ,b = 7 flag =true -> result =3
    //예시 a = -4 ,b = 7 flag =false -> result =-11


    public static void main(String[] args) {
        int a = -4;
        int b = 7;

        DependonFlag solutuion = new DependonFlag();

        System.out.println("solutuion1 = " + solutuion.solution1(a,b,true));
        System.out.println("solutuion2 = " + solutuion.solution2(a,b,true));

    }
    public  int solution1(int a ,int b, boolean flag){

        int answer =0;

        if (flag){
            answer = a+b;
        }else {
            answer = a-b;
        }

        return answer;
    }

    public int solution2(int a ,int b, boolean flag){
        return flag?a+b:a-b;
    }


}
