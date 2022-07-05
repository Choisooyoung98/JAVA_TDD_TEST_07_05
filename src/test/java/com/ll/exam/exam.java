package com.ll.exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class exam {
    @Test
    public void 더하기() {
        int rs = Calculator.add("10 + 10");

        assertEquals(20, rs);
    }
    @Test
    public void 빼기() {
        int rs = Calculator.minus("10 - 5");

        assertEquals(5, rs);
    }

    @Test
    public void 곱하기() {
        int rs = 10 * 5;

        assertEquals(50, rs);
    }
}
