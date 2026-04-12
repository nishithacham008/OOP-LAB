class Account {
    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        a.showBalance();
    }
}