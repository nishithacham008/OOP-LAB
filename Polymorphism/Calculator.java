class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    void display() {
        System.out.println("Addition with 2 integers: " + add(10, 20));
        System.out.println("Addition with 3 integers: " + add(10, 20, 30));
        System.out.println("Addition with doubles: " + add(5.5, 4.5));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.display();
    }
}