class Rectangle {
    int length;
    int breadth;

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        System.out.println("Area: " + r1.area());
    }
}