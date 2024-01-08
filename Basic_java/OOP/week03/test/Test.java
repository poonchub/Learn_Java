package week03.test;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        double n = 100.00;
        DecimalFormat dfm = new DecimalFormat("0.##");
        System.out.println(dfm.format(n));
    }
}
