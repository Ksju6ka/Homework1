import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte byteVar = 76;
        short shortVar = 4098;
        int intVar = 6785334;
        long longVar = (long) 1e9;

        float floatVar = 123.87654f;
        double doubleVar = 1.6d;

        char symbol = '+';
        boolean boolVar = true;
        String stringVar = "text";

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x >= 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        }

    }

    static float calculation(float a, float b, float c, float d) {
        if (d == 0) {
            return 0;
        }
        return a * (b + (c / d));
    }

    static boolean calculateSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    }