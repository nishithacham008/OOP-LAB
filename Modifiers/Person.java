class Person {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void getName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Anu");
        p.getName();
    }
}