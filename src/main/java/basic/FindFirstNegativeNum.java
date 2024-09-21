package basic;

import java.util.stream.IntStream;

public class FindFirstNegativeNum {

    //제공된 문제
//    int solution(int num_list[], size_t num_list_len) {
//        int answer = 0;
//        return answer;
//    }
//    문제 설명
//    정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
//            5 ≤ num_list의 길이 ≤ 100
//            -10 ≤ num_list의 원소 ≤ 100
//
//            [12, 4, 15, 46, 38, -2, 15] -> 	5
//            [13, 22, 53, 24, 15, 6]	-> -1

    public static void main(String[] args) {
        // num_list 배열 정의
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};
        FindFirstNegativeNum finder = new FindFirstNegativeNum();
        int result = finder.solution1(num_list);
        int solutuoin2 = finder.solution2(num_list);

        // 결과 출력
        System.out.println("첫 번째 음수는: " + "배열의 " + result + " 에 존재하며" + num_list[result] + "입니다" );
        System.out.println("solutuoin2 = " + solutuoin2);
    }

    // 음수 찾는 메서드
    public int solution1(int num_list[]) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1; // 음수가 없을 경우 -1 반환
    }

    public int solution2(int[] numList){
        return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
    }



}