public class TestMathUtils {
    public static void main(String[] args) throws Exception {
        // Normal test cases
        int addResult = MathUtils.add(10, 5);
        System.out.println("Sum: " + addResult);

        int subtractResult = MathUtils.subtract(10, 5);
        System.out.println("Difference: " + subtractResult);

        int multiplyResult = MathUtils.multiply(10, 5);
        System.out.println("Product: " + multiplyResult);

        double divideResult = MathUtils.divide(10, 5);
        System.out.println("Quotient: " + divideResult);

        // Edge test cases
        System.out.println("Edge test cases \n");
        
        // Test Java int limit (2147483647)
        int addResult2 = MathUtils.add(2147483647, 1);
        System.out.println("Sum: " + addResult2);

        // Divide 0 by number
        double divideResult2 = MathUtils.divide(0, 5);
        System.out.println("Quotient: " + divideResult2);

        // Divide by 0
        double divideResult3 = MathUtils.divide(10, 0);
        System.out.println("Quotient: " + divideResult3);

        // Divide negative number
        double divideResult4 = MathUtils.divide(-5, 0);
        System.out.println("Quotient: " + divideResult4);
    }
}
