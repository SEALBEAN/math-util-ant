/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seal.mathutil.core.test;

import static com.seal.mathutil.core.MathUtil.getFactorial;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//import static ... tên class.tên hàm;
//thì không cần tên class nữa 

/**
 *
 * @author xuhet
 */
// Kĩ thuật  DDT - Data Driven Testing
// DDT là kĩ thuật tổ chức các test cases cho gọn gàng
// Tách các câu lệnh kiểm thử và bộ data dùng để test riêng ra 2 nơi
// Phiên bản test JUNIT vừa học đang trộn data test và gọi hàm
// lẫn lộn với nhau, nhìn ko rõ ràng
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //Chuẩn bị data để nhồi vào hàm test
    //quy ước hàm chuẩn bị data phải là static 
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }

    @Parameterized.Parameter(value = 0) //Map biến này với cột 0
    public int n;
    
    @Parameterized.Parameter(value = 1) //Map biến này với cột 1
    public long expected;
    //2 biến này map vào 2 cột của hàm initData
    //sau đó ta nhồi 2 biến này vào trong hàm assertEquals()

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }
}
