public class ErrorHandling {

    public static void main(String[] args) {
        try {
            // Metodu çağırma örneği
            performOperation(10, 5);
            performOperation(20, 0); // Bu çağrı bir hata üretecek
        } catch (CustomException1 e) {
            System.out.println("CustomException1 caught: " + e.getMessage());
        } catch (CustomException2 e) {
            System.out.println("CustomException2 caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static void performOperation(int a, int b) throws CustomException1, CustomException2 {
        // Yöntem senaryosu
        if (b == 0) {
            throw new CustomException1("Division by zero is not allowed.");
        } else if (a > 15) {
            throw new CustomException2("Custom condition not met.");
        } else {
            int result = a / b;
            System.out.println("Result of the operation: " + result);
        }
    }

    // Özel hata türleri
    static class CustomException1 extends Exception {
        public CustomException1(String message) {
            super(message);
        }
    }

    static class CustomException2 extends Exception {
        public CustomException2(String message) {
            super(message);
        }
    }
}

