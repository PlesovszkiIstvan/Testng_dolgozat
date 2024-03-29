/*
* File: App.java
* Author: Plesovszki István
* Copyright: 2024, Plesovszki István
* Group: Szoft II/2/N
* Date: 2024-01-17
* Github: https://github.com/PlesovszkiIstvan/Testng_dolgozat
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy Alpha szöget!");
        double alpha = scanner.nextDouble();
        System.out.println("Kérem az oldal hosszát!");
        double side = scanner.nextDouble();
        System.out.println("Terület: " + calculate.calcArea(side, alpha));
        System.out.println("Kerület: " + calculate.calcDiameter(side));
    }
}
