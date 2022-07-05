package com.ll.exam;

public class Calculator {
    public static int add(String s) {
        // '+' 기준으로 자르기
        String[] strings = s.split(" \\+ ");
        int a = Integer.parseInt(strings[0]);   // 첫번째 숫자
        int b = Integer.parseInt(strings[1]);   // 두번째 숫자

        return a + b;
    }
}
