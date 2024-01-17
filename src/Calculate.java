/*
* File: Calculate.java
* Author: Plesovszki István
* Copyright: 2024, Nagy János
* Group: Szoft II/2/N
* Date: 2024-01-17
* Github: https://github.com/PlesovszkiIstvan/Testng_dolgozat
* Licenc: GNU GPL
*/

public class Calculate {
    public double calcArea(double side, double alpha){
        return (Math.pow(side,2))*(Math.sin(alpha));
    }

    public double calcDiameter(double side){
        return 4*side;
    }
}
