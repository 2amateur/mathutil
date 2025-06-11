package com.trongnt.util.mathutil.core;

public class MathUtility {
    //Class này dùng để cung cấp các hàm tính toán Toán học
    //Bắt chước Class Math. trong JDK
    //Vì những tính toán này tính xong rồi trả ra, không cần lưu trữ lại
    //Do đó ta thiết kế nó dạng static


    //Ta làm hàm tính n! = 1.2.3.4.5...n
    //Quy ước:
    // 0! = 1
    // Không có giải thừa số âm, ví dụ -5! không hợp lệ
    // 20! vừa đ kiểu long, 21! không dùng long được
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
            //nếu đưa data n cà chớn, ném ra ngoại lệ, ném câu thông báo,
            //không có giá trị trở về
        }
        if(n == 0){
            return 1;
        }

        // CPU chạy được đến đây tức là n = 1, 2, 3, ..., 19, 20
        //Tính n! = 1.2.3.4...  -> Thuật toán con heo đất, ốc bu nhồi thịt - nhân dồn, cộng dồn, tích luỹ
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i; // i = 1 nhân 1, i = 2 nhân 2, i = 3 nhân 3, dồn và result
                        // đang có bao nnhieue nhân tiếp
        }

        return result;
    }
}
