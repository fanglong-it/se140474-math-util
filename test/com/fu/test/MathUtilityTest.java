/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.test;

import com.fu.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */


public class MathUtilityTest {

    //ta sẽ viết những đoạn code ở đây để test cái hàm chính getFactorial()
    //bên MathUtility coi mày chạy có đúng khong
    //viết code để test code chính 
    //đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    
    @Test //biến hàm thường thành hàm main()
    //Shift-f6 để chạy
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        int n = 5; //tui mún tính 5!
        long expected = 120; //tui hy vọng trả về 120
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //nếu khớp thì màu xanh, sai lệch thì màu đỏ
        
    }

}
