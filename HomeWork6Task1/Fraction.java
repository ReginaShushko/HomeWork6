package HomeWork6Task1;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    private int nod(int a, int b) { //Наибольший общий делител
        return b == 0 ? a : nod(b, a % b);
    }

    private int nok(int a, int b) { //Наименьшее общее кратное
        return a / nod(a, b) * b;
    }

    public Fraction add(Fraction other) {
        Fraction result = new Fraction(1, 1);
        if (this.denominator == other.denominator) { //если знаменатели одинаковые
            result.denominator = this.denominator;
            result.numerator = this.numerator + other.numerator;
        } else { // если разные знаменатели
            int nok = nok(this.denominator, other.denominator);
            result.denominator = nok;
            result.numerator = this.numerator * (nok / this.denominator) + other.numerator * (nok / other.denominator);
        }
        return result;
    }

    public double multiply(double d) {
        return (double) this.numerator / this.denominator * d;
    }

    public double divide(double d) {
        return (double) this.numerator / this.denominator / d;
    }
}


