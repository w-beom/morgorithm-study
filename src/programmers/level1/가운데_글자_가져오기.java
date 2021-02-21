package programmers.level1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        boolean isEven = s.length() % 2 == 0;
        int middle = s.length()/2;
        if(isEven){
            return s.substring(middle-1, middle+1);
        }else{
            return s.substring(middle, middle+1);
        }
    }

    public static void main(String[] args) {
        가운데_글자_가져오기 middleWord = new 가운데_글자_가져오기();
        System.out.println(middleWord.solution("abcde"));
        System.out.println(middleWord.solution("qwer"));
    }
}
