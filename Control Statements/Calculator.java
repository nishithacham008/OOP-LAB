class Calculator {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        char op = '*';
        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        System.out.println("Result: " + result);
    }
}