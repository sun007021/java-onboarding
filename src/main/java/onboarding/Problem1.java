package onboarding;

import java.util.List;

class Player {
    private int maxNum;
    private int leftPageNum, rightPageNum;

    protected int sumEachNum(int num) {// 정수의 각 자리수를 더함
        int sum;// 각 자리수의 합을 저장할 변수
        sum = 0;
        while (num > 0) {// 반복
            sum = sum + (num % 10); // 맨 뒷자리 하나씩을 더함
            num /= 10; //맨 뒷자리를 없애줌
        }
        return sum;
    }

    public void setLeftPageNum(int leftPageNum) {
        this.leftPageNum = leftPageNum;
    }

    public void setRightPageNum(int rightPageNum) {
        this.rightPageNum = rightPageNum;
    }

    public int getMaxNum() {
        return maxNum;
    }
}

class PageException extends RuntimeException {
}

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
    //game 에서 player 마다 값 넣어줌
    // game 에서 값 넣어주기 전에 예외처리 검사

}