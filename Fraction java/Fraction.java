import java.util.Scanner;
 
/**
 * transform a fraction into an addition of base fractions
 * 
 * @author Jonas Rhbary
 * @date 2018-12-04
 * @version 1.0
 */
public class Fraction {
 
    static Scanner in;
 
    /**
     * constructor
     */
    public Fraction() {
        in = new Scanner(System.in);
    }
 
    /**
     * starts the execution
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        Fraction program = new Fraction();
        program.run();
 
        in.close();
    }
 
    /**
     * description
     */
    private void run() {
        long numerator;
        long denominator;
        long multiple;
        long reduced;
 
        System.out.print("Zaehler >");
        numerator = in.nextLong();
        System.out.print("Nenner >");
        denominator = in.nextLong();
        if (numerator < denominator) {
            System.out.print(numerator + " / " + denominator + "=");
 
            while (numerator > 0) {
                multiple = numerator;
                while (multiple < denominator) {
                    multiple = multiple + numerator;
                }
                reduced = multiple / numerator;
                System.out.print(" + 1/" + reduced);
 
                numerator = (numerator * reduced) - denominator;
                denominator = denominator * reduced;
            }
        } else {
            System.out.println("Nur Brüche kleiner 1");
        }
    }
}