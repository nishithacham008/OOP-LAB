class Animal {
    String name;

    void setName(String n) {
        name = n;
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    void setBreed(String b) {
        breed = b;
    }

    void showDetails() {
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Rocky");
        d.setBreed("Labrador");
        d.display();
        d.showDetails();
    }
}