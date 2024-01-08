package week03.lab.lab1;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args){
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double convertedTemp;
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        sc.close();
        if (tempScale=='K' || tempScale=='k'){
            convertedTemp = celsius+273.15;
            System.out.println("Kelvin: "+convertedTemp);
        }
        else if (tempScale=='F' || tempScale=='f'){
            convertedTemp = (celsius*9/5)+32;
            System.out.println("Fahrenheit: "+convertedTemp);
        }
        else if (tempScale=='R' || tempScale=='r'){
            convertedTemp = (celsius+273.15)*9/5;
            System.out.println("Rankine: "+convertedTemp);
        }
        else {
            System.out.println("Invalid temperature scale!");
        }
    }
} 