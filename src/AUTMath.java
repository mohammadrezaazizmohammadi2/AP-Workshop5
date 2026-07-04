public class AUTMath {

    // جمع 
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // تفریق 
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    
    public static int multiply(int num1, int num2) {
        return num1 * num2; 
    }

    
    public static int divide(int num1, int num2) {
        if (num2 == 0) return 0; // این خط هم برای ایمنی اضافه شد
        return num1 / num2;
    }

    // فاکتوریل 
    public static int factorial(int number) {
        if (number < 0) return -1;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // توان 
    public static int pow(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
