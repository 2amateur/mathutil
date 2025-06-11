package com.trongnt.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MathUtilityTest {




    @Test
    public void verifyFactorialGivenRightArg3RunsWell() {
        //0! có là 1 hay không
        assertEquals(6, MathUtility.getFactorial(3));
    }

    @Test
    public void verifyFactorialGivenRightArg2RunsWell() {
        //0! có là 1 hay không
        assertEquals(2, MathUtility.getFactorial(2));
    }

    @Test  //@Test tương đương hàm main(), tức là code trong hàm này sẽ run như hàm main()
    //biến mỗi test case thành test run, thành main() để chạy
    public void verifyFactorialGivenRightArg1RunsWell() {
        //1! có là 1 hay không
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void verifyFactorialGivenRightArg0RunsWell() {
        //0! có là 1 hay không
        assertEquals(1, MathUtility.getFactorial(0));
    }
}