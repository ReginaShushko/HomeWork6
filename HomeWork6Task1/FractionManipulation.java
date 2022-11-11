package HomeWork6Task1;


public class FractionManipulation {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2, 3);
        System.out.println("Fraction 1: " + fraction1);

        Fraction fraction2 = new Fraction(3, 4);
        System.out.println("Fraction 2: " + fraction2);

        Fraction resultSum = fraction1.add(fraction2);
        System.out.println("Sum result: " + resultSum);

        double multiplication = fraction1.multiply(1.2);
        System.out.println("Multiplication result: " + multiplication);

        double divide = fraction1.divide(1.5);
        System.out.println("Result of division: " + divide);
    }
}
