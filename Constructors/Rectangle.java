class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println("Area: " + r1.area());
    }
}