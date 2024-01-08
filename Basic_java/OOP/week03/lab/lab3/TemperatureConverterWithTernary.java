package week03.lab.lab3;

import java.util.Scanner;

public class TemperatureConverterWithTernary {
    public static void main(String[] args){
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        // double convertedTemp;
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        sc.close();

        String st = "";
        st = (tempScale=='K' || tempScale=='k') ? "Kelvin: "+(celsius+273.15) : ((tempScale=='F' || tempScale=='f') ? "Fahrenheit: "+((celsius*9/5)+32) : ((tempScale=='R' || tempScale=='r')) ? "Rankine: "+((celsius+273.15)*9/5) : "Invalid temperature scale!");

        System.out.println(st);
    }
}
