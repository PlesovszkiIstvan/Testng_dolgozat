/*
* File: tets.java
* Author: Plesovszki István
* Copyright: 2024, Nagy János
* Group: Szoft II/2/N
* Date: 2024-01-17
* Github: https://github.com/PlesovszkiIstvan/Testng_dolgozat
* Licenc: GNU GPL
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

    @Test
    public void testCalculateArea(){
        Calculate calc = new Calculate();
        double calculated = calc.calcArea(30, 45);
        double actual = 765.8131720807066;
        Assert.assertEquals(calculated, actual);
    }
    @Test
    public void testCalculateAreaFail(){
        Calculate calc = new Calculate();
        double calculated = calc.calcArea(30, 45);
        double actual = 5;
        Assert.assertEquals(calculated, actual);
    }
    @Test
    public void testCalculateDiameter(){
        Calculate calculate = new Calculate();
        double calculated = calculate.calcDiameter(30);
        double actual = 120;
        Assert.assertEquals(calculated, actual);
    }
    @Test
    public void testCalculateDiameterFail(){
        Calculate calculate = new Calculate();
        double calculated = calculate.calcDiameter(30);
        double actual = 5;
        Assert.assertEquals(calculated, actual);
    }
}