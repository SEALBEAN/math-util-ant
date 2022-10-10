/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seal.mathutil.core.test;

import com.seal.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author xuhet
 */
public class MathUtilTest {

    //@Test là 1 đánh dấu - annotation để báo với JVM
    //biết rằng hàm này là hàm main() và chạy cốt trong hàm này
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }

    //Bắt Exception thì sao
    @Test(expected = IllegalArgumentException.class)
    //Test case : n = -5, -5! expected: Hi vọng thấy exception đc ném ra
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
}
