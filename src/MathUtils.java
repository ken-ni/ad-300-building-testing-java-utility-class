public class MathUtils {
    public static int add(int a, int b) {
        // Test max value int
        if (a + b <= -2147483647 || a + b >= 2147483647) {
            System.out.println("Number goes past int limit");
            return -99999999;
        }
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        // Test division by zero
        if (b <= 0) {
            return Double.NaN;
        }
        return (double)a / b;
    }
}
