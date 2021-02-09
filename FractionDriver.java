public class FractionDriver{
    public static void main(String[] args){
        Fraction frac = new Fraction(1,2);
       
        Fraction f1 = new Fraction(frac);
        Fraction f2 = new Fraction(1,3);
        
        System.out.println("The first number is: " + f1);
        System.out.println("The second number is: " + f2);
        
        Fraction mulAns = Fraction.multiply(f1,f2);
        System.out.println("multiply result is: " + mulAns);
        
        Fraction divAns = Fraction.divide(f1,f2);
        System.out.println("divid result is: " + divAns);
        
        Fraction addAns = Fraction.add(f1,f2);
        System.out.println("add result is: " + addAns);
        
        Fraction subAns = Fraction.subtract(f1,f2);
        System.out.println("subtract result is: " + subAns);
    }
}