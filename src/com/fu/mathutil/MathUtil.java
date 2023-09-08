/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Minh Khang
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtilDemo.getFactorial(5);
        System.out.println("expected = 5! = 120; actual = " + result);
    }
}
