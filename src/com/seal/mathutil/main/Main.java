/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.seal.mathutil.main;

import com.seal.mathutil.core.MathUtil;
import utils.QuangUtils;

/**
 *
 * @author xuhet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = QuangUtils.getInt("Input int: ");
        System.out.println(MathUtil.getFactorial(n));
    }
    
}
