package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Apptest {
    @Test
    public void 더하기() {
        int rs = Calculator.calc("10 + 20");
        assertEquals(30, rs);
    }
    @Test
    public void 더하기_2() {
        int rs = Calculator.calc("20 + 20");
        assertEquals(40, rs);
    }
    @Test
    public void 더하기_3() {
        int rs = Calculator.calc("10 + 10");
        assertEquals(20, rs);
    }
    @Test
    public void 빼기() {
        int rs = Calculator.calc("10 - 10");
        assertEquals(0, rs);
    }
    @Test
    public void 곱하기() {
        int rs = Calculator.calc("1 * 2");
        assertEquals(2, rs);
    }
    @Test
    public void 나누기() {
        int rs = Calculator.calc("4 / 2");
        assertEquals(2, rs);
    }
}
