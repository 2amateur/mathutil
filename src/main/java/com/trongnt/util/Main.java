package com.trongnt.util;

import com.trongnt.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArgsRunsWell();
    }

    //Test case #4, 5, 6,...: Verify the GetFactorial() with n = 3, 4, 5, ...;
    public static void verifyFactorialGivenRightArgsRunsWell(){
        System.out.println("3! = expected: 6"  + ", actual: "+ MathUtility.getFactorial(3));
        System.out.println("4! = expected: 24"  + ", actual: "+ MathUtility.getFactorial(4));
        System.out.println("5! = expected: 120"  + ", actual: "+ MathUtility.getFactorial(5));
        System.out.println("6! = expected: 720"  + ", actual: "+ MathUtility.getFactorial(6));
    }

    //Test case #3: Verify the GetFactorial() with n = 2;
    public static void verifyFactorialGivenRightArg2RunsWell(){
        System.out.println("2! = expected: 2"  + ", actual: "+ MathUtility.getFactorial(2));

    }

    //Test case #2: Verify the GetFactorial() with n = 1;
    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1; // hi vọng 1 được trả về nếu tính 1!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("1! = expected: " + expected + ", actual: "+ actual);

    }


    //Test thử hàm tính giai thừa, gọi trong main()
    // Muốn test gì đó thì phải có Test Case!!!
    //TEST CASE #1: Verify the GetFactorial() with n = 0;
    //STEPS:
    //      Given n = 0
    //      Call getFactorial(n = 0)
    //EXPECTED RESULT:
    //           The method must return 1 as the result of 0! = 1
    //STATUS: PASSED / FAILED phải chờ

    public static void verifyFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1; // hi vọng 1 được trả về nếu tính 0!
        long actual = MathUtility.getFactorial(n);
        //Test là so sánh
        System.out.println("0! = expected: " + expected + ", actual: "+ actual);

    }

}
// Kĩ thuật vừa gõ code, vừa gõ test case, vừa gõ test run, được gọi là
// TDD (Đưa vào CV) - TEST DRIVEN DEVELOPEMENT