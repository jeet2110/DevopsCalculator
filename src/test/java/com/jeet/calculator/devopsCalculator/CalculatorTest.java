 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeet.calculator.devopsCalculator;
import org.junit.*;
public class CalculatorTest {

    @Test
    public void testAdd() {
        double a = 15;
        double b = 20;
        double expectedResult = 35;
        double result = Calculator.add(a, b);
        Assert.assertEquals(expectedResult, result, 0.1);
    }

    @Test
    public void testSubtract() {
        double a = 25;
        double b = 20;
        double expectedResult = 5;
        double result = Calculator.subtract(a, b);
        Assert.assertEquals(expectedResult,result, 0.1);
    }

    @Test
    public void testMultiply() {
        double a = 24;
        double b = 10;
        double expectedResult = 240;
        double result = Calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test
    public void testDivide() {
        double a = 56;
        double b = 10;
        double expectedResult = 5.6;
        double result = Calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        double a = 15;
        double b = 0;
        Calculator.divide(a, b);
    }
}
