public class Main {

    public static void assertResult(int expected, int actual, String testName) {
        if (expected != actual) {
            System.out.println("Error in " + testName + ": expected " + expected + " but got " + actual);
            System.exit(1);
        } else {
            System.out.println(testName + " passed!");
        }
    }

    public static void main(String[] args) {
        assertResult(5, AUTMath.sum(2, 3), "sum");
        assertResult(10, AUTMath.subtract(15, 5), "subtract");
        assertResult(20, AUTMath.multiply(4, 5), "multiply");
        assertResult(2, AUTMath.divide(10, 5), "divide");
        assertResult(120, AUTMath.factorial(5), "factorial");
        assertResult(8, AUTMath.pow(2, 3), "pow");
    }
}
