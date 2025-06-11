package com.trongnt.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {


    //Chuẩn bị bộ Data để riêng - DD - Data Driven
    //Lát hồi fill vào hàm so sánh - T - Testing
    //Fill vào qua tham số hàm - hàm làm việc với nhiều data
    //DDT còn gọi tên khác: Parameterized Testing -> kiểm thử theo kiểu tham số hoá

    //Bộ Data: nằm trong hàm Static - tĩnh 1 chỗ để các nơi vo lấy
    //Bộ Data: thường là mảng 2 chiều, gồm giá trị đầu vào và giá trị kỳ vọng
    public static Object[][] initData(){
        //int[] a = {5, 10, 15, 20}; - mảng 1 chiều
        return new Object[][]{{0, 1},
                              {1, 1},
                              {2, 2},
                              {3, 6},
                              {4, 24},
                              {5, 120},
                              {6, 720}};
                            // n  expected
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }


}