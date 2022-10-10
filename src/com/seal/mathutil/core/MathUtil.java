/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seal.mathutil.core;

/**
 *
 * @author xuhet
 */
public class MathUtil {
    public static long getFactorial(int n) {
        if (0 > n || n > 20) 
            throw new IllegalArgumentException("Invalid arguement. n must be between 0 to 20");
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *=i;
        
        return product;
    }
}
