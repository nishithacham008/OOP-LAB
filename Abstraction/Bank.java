abstract class Bank {
    abstract int getInterestRate();
}

class SBI extends Bank {
    int getInterestRate() {
        return 6;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 7;
    }
}

class Test {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest: " + b.getInterestRate() + "%");
    }
}