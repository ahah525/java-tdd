package com.ll.exam;

public class Calculator {
    public static int calc(String s) {
        if(s.contains("+")) {
            return calcPlus(s);
        } else if(s.contains("-")) {
            return calcMinus(s);
        } else if(s.contains("*")) {
            return calcMultiply(s);
        } else if(s.contains("/")) {
            return calcDivide(s);
        }
        return 0;
    }

    // 더하기 메서드
    private static int calcPlus(String s) {
        // '+' 기준으로 자르기
        String[] strings = s.split(" \\+ ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a + b;
    }

    // 빼기 메서드
    private static int calcMinus(String s) {
        // '-' 기준으로 자르기
        String[] strings = s.split(" \\- ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a - b;
    }
    // 곱하기 메서드
    private static int calcMultiply(String s) {
        // '*' 기준으로 자르기
        String[] strings = s.split(" \\* ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a * b;
    }

    private static int calcDivide(String s) {
        // '/' 기준으로 자르기
        String[] strings = s.split(" \\/ ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a / b;
    }
}
