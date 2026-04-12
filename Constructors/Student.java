class Student {
    int id;
    String name;

    Student() {
        id = 101;
        name = "Nishitha";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}