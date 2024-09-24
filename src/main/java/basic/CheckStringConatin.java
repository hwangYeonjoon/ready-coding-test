package basic;

public class CheckStringConatin {
    public static void main(String[] args) {

        String word ="banana";
        String prefix ="ba";
        CheckStringConatin solution = new CheckStringConatin();
        System.out.println("solution.solution1(word, prefix) = " + solution.solution1(word, prefix));
        System.out.println("solution.solution2(word, prefix) = " + solution.solution2(word, prefix));

    }
    public int solution1(String word, String prefix) {

        int answer = 0;
        String temp ="";
        for (int i =0 ;i<word.length(); i++){
            temp += word.charAt(i);
            if (temp.equals(prefix)){
                answer =1;
                return answer;
            }
        }


        return answer;
    }


    public int solution2(String word,String prefix){
        int answer =0;

        if (word.startsWith(prefix)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }


}
