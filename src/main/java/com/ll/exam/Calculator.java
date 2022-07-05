package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        // 수식에 '-' 가 있는지 여부
        boolean isMinus = s.indexOf(" - ") != -1;

        if(isMinus) {
            // 빼기 결과 리턴
            return runMinus(s);
        }
        // 더하기 결과 리턴
        return runPlus(s);
    }

    // 더하기 메서드
    private static int runPlus(String s) {
        // '+' 기준으로 자르기
        String[] strings = s.split(" \\+ ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a + b;
    }

    // 빼기 메서드
    private static int runMinus(String s) {
        // '-' 기준으로 자르기
        String[] strings = s.split(" \\- ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a - b;
    }
}
