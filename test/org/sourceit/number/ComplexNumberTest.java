package org.sourceit.number;

import org.junit.Assert;
import org.junit.Test;
import org.sourceit.number.ComplexNumber;

public class ComplexNumberTest {

    @Test
    public void testCreationOfComplexNumber1() {

        ComplexNumber number = new ComplexNumber();

        Assert.assertEquals(number.getRealPart(), 0);
        Assert.assertEquals(number.getImagPart(), 0);

    }

    @Test
    public void testCreationOfComplexNumber2() {

        ComplexNumber number = new ComplexNumber(2, 3);

        Assert.assertEquals(number.getRealPart(), 2);
        Assert.assertEquals(number.getImagPart(), 3);

    }

    @Test(expected = ComplexNumberIllegalArgumentException.class)
    public void testCreationOfComplexNumber3() {

        ComplexNumber number = new ComplexNumber(0, 0);
    }

    @Test
    public void testAdditionOfComplexNumber1() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 5);

        ComplexNumber number3 = number1.add(number2);

        Assert.assertEquals(number3.getRealPart(), 5);
        Assert.assertEquals(number3.getImagPart(), 5);

    }

    @Test
    public void testAdditionOfComplexNumber2() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 0);

        ComplexNumber number3 = number1.add(number2);

        Assert.assertEquals(number3.getRealPart(), 8);
        Assert.assertEquals(number3.getImagPart(), 3);

    }

    @Test
    public void testSubstractionOfComplexNumber1() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 0);

        ComplexNumber number3 = number1.subtract(number2);

        Assert.assertEquals(number3.getRealPart(), -1);
        Assert.assertEquals(number3.getImagPart(), 3);

    }

    @Test
    public void testSubtractionOfComplexNumber2() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 5);

        ComplexNumber number3 = number1.add(number2);

        Assert.assertEquals(number3.getRealPart(), -1);
        Assert.assertEquals(number3.getImagPart(), -2);

    }

    @Test
    public void testMultiplicationOfComplexNumber1() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 0);

        ComplexNumber number3 = number1.multiply(number2);

        Assert.assertEquals(number3.getRealPart(), 6);
        Assert.assertEquals(number3.getImagPart(), 9);

    }

    @Test
    public void testMultiplicationOfComplexNumber2() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 5);

        ComplexNumber number3 = number1.multiply(number2);

        Assert.assertEquals(number3.getRealPart(), -9);
        Assert.assertEquals(number3.getImagPart(), 19);

    }

    @Test
    public void testDivisionOfComplexNumber1() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 0);

        ComplexNumber number3 = number1.divide(number2);

        Assert.assertEquals(number3.getRealPart(), 0);
        Assert.assertEquals(number3.getImagPart(), 1);

    }

    @Test
    public void testDivisionOfComplexNumber2() {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(3, 5);

        ComplexNumber number3 = number1.divide(number2);

        Assert.assertEquals(number3.getRealPart(), 0);
        Assert.assertEquals(number3.getImagPart(), 0);

    }

    @Test
    public void testDivisionOfComplexNumber3() {

        ComplexNumber number1 = new ComplexNumber(10, 3);
        ComplexNumber number2 = new ComplexNumber(3, 5);

        ComplexNumber number3 = number1.divide(number2);

        Assert.assertEquals(number3.getRealPart(), 1);
        Assert.assertEquals(number3.getImagPart(), 1);

    }


}
