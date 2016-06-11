package org.sourceit.fraction;

import org.junit.Assert;
import org.junit.Test;
import org.sourceit.number.ComplexNumber;

public class ComplexFractionTest {

    @Test
    public void testCreationOfComplexFraction1() {
        ComplexFraction complexFraction = new ComplexFraction();

        Assert.assertEquals(complexFraction.getNumerator().getReal(), 1);
        Assert.assertEquals(complexFraction.getDenumerator().getReal(), 1);
        Assert.assertEquals(complexFraction.getNumerator().getImag(), 1);
        Assert.assertEquals(complexFraction.getDenumerator().getImag(), 1);
    }

    @Test
    public void testCreationOfComplexFraction2() {
        ComplexNumber numerator = new ComplexNumber(2, 3);
        ComplexNumber denumerator = new ComplexNumber(5, 9);
        ComplexFraction complexFraction = new ComplexFraction(numerator, denumerator);

        Assert.assertEquals(complexFraction.getNumerator().getReal(), 2);
        Assert.assertEquals(complexFraction.getDenumerator().getReal(), 5);
        Assert.assertEquals(complexFraction.getNumerator().getImag(), 3);
        Assert.assertEquals(complexFraction.getDenumerator().getImag(), 9);
    }

    @Test(expected = ComplexFractionIllegalArgumentException.class)
    public void testCreationOfComplexFraction3() {
        ComplexNumber numerator = new ComplexNumber(0, 0);
        ComplexNumber denumerator = new ComplexNumber(0, 0);
        ComplexFraction complexFraction = new ComplexFraction(numerator, denumerator);
    }

    @Test
    public void testAddingOfComplexFractions1() {
        ComplexFraction complexFraction1 = new ComplexFraction(new ComplexNumber(2, 5), new ComplexNumber(4, 8));
        ComplexFraction complexFraction2 = new ComplexFraction(new ComplexNumber(1, 5), new ComplexNumber(2, 3));

        ComplexFraction result = new ComplexFraction(new ComplexNumber(-25, 44), new ComplexNumber(-16, 28));

        Assert.assertEquals(complexFraction1.add(complexFraction2), result);
    }

    @Test
    public void testSubtractionOfComplexFractions1() {
        ComplexFraction complexFraction1 = new ComplexFraction(new ComplexNumber(2, 5), new ComplexNumber(4, 8));
        ComplexFraction complexFraction2 = new ComplexFraction(new ComplexNumber(1, 5), new ComplexNumber(2, 3));
        ComplexFraction result = new ComplexFraction(new ComplexNumber(47, 44), new ComplexNumber(-16, 28));
        Assert.assertEquals(complexFraction1.subtract(complexFraction2), result);
    }

    @Test
    public void testMultiplicationOfComplexFractions1() {

        ComplexFraction complexFraction1 = new ComplexFraction(new ComplexNumber(2, 5), new ComplexNumber(4, 8));
        ComplexFraction complexFraction2 = new ComplexFraction(new ComplexNumber(1, 5), new ComplexNumber(2, 3));

        ComplexFraction result = new ComplexFraction(new ComplexNumber(-23, 15), new ComplexNumber(-16, 28));

        Assert.assertEquals(complexFraction1.multiply(complexFraction2), result);

    }

    @Test
    public void testDivisionOfComplexFractions1() {

        ComplexFraction complexFraction1 = new ComplexFraction(new ComplexNumber(2, 5), new ComplexNumber(4, 8));
        ComplexFraction complexFraction2 = new ComplexFraction(new ComplexNumber(1, 5), new ComplexNumber(2, 3));

        ComplexFraction result = new ComplexFraction(new ComplexNumber(-11, 16), new ComplexNumber(-36, 28));

        Assert.assertEquals(complexFraction1.divide(complexFraction2), result);

    }

}
