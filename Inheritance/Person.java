class Person {
    String name;
    int age;

    void setPerson(String n, int a) {
        name = n;
        age = a;
    }
}

class Student extends Person {
    int rollNo;

    void setStudent(int r) {
        rollNo = r;
    }
}

class Result extends Student {
    int marks1, marks2;

    void setMarks(int m1, int m2) {
        marks1 = m1;
        marks2 = m2;
    }

    void display() {
        int total = marks1 + marks2;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {
        Result r = new Result();
        r.setPerson("Nishitha", 18);
        r.setStudent(25);
        r.setMarks(85, 90);
        r.display();
    }
}