class LogicalOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;

        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("XOR: " + xorResult);
        System.out.println("NOT: " + notResult);
    }
}