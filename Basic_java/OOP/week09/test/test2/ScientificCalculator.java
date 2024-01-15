package week09.test.test2;

public class ScientificCalculator extends Calculator{
    
    public ScientificCalculator(String name){
        super(name, " [Scientific Calculator]");
    }

    public void add(double n1, double n2){
        super.add(n1, n2);
        System.out.printf("%.6f + %.6f = %.6f\n",n1,n2,(n1+n2));
    }

    public void subtract(double n1, double n2){
        super.subtract(n1, n2);
        System.out.printf("%.6f - %.6f = %.6f\n",n1,n2,(n1-n2));

    }

    public void multiply(double n1, double n2){
        super.multiply(n1, n2);
        System.out.printf("%.6f * %.6f = %.6f\n",n1,n2,(n1*n2));
    }
    
    public void divide(double n1, double n2){
        super.divide(n1, n2);
        System.out.printf("%.6f / %.6f = %.6f\n",n1,n2,(n1/n2));
    }
}
