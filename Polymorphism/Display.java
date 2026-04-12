class Display {

    void show(int a) {
        System.out.println("Integer value: " + a);
    }

    void show(double a) {
        System.out.println("Double value: " + a);
    }

    void show(String a) {
        System.out.println("String value: " + a);
    }

    void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.show(10);
        d.show(10.5);
        d.show("Java");
        d.show(25, "Nishitha");
    }
}