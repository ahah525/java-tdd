package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        if(s.contains("+")) {
            return runPlus(s);
        } else if(s.contains("-")) {
            return runMinus(s);
        } else if(s.contains("*")) {
            return runMultiply(s);
        } else if(s.contains("/")) {
            return runDivde(s);
        }
        return 0;
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
    // 곱하기 메서드
    private static int runMultiply(String s) {
        // '*' 기준으로 자르기
        String[] strings = s.split(" \\* ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a * b;
    }

    private static int runDivde(String s) {
        // '/' 기준으로 자르기
        String[] strings = s.split(" \\/ ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a / b;
    }
}
