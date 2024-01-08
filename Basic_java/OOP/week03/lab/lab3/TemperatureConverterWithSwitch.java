// package week03.lab.lab3;

import java.util.Scanner;

public class TemperatureConverterWithSwitch {
    public static void main(String[] args){
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double convertedTemp;
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        String st = "";
        sc.close();

        switch (tempScale) {
            case 'k':
                convertedTemp = celsius+273.15;
                st = "Kelvin: "+convertedTemp;
                break;
            case 'K':
                convertedTemp = celsius+273.15;
                st = "Kelvin: "+convertedTemp;
                break;
            case 'F':
                convertedTemp = (celsius*9/5)+32;
                st = "Fahrenheit: "+convertedTemp;
                break;
            case 'f':
                convertedTemp = (celsius*9/5)+32;
                st = "Fahrenheit: "+convertedTemp;
                break;
            case 'R':
                convertedTemp = (celsius+273.15)*9/5;
                st = "Rankine: "+convertedTemp;
                break;
            case 'r':
                convertedTemp = (celsius+273.15)*9/5;
                st = "Rankine: "+convertedTemp;
                break;

            default:
                st = "Invalid temperature scale!";
                break;
        }
        System.out.println(st);

    }
}
