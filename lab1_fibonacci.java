class Lab1_fibonacci {
    public static void main(String[] args) {
        // initially 1 1 will be printed
        int previous= 1;
        int early = 1;
        System.out.print(previous + "\t" + early);

        for(int i = 3; i<=Integer.parseInt(args[0]); i++) {
            // assigning F(n) = F(n-1) + F(n-2)
            int current = previous+early;
            System.out.print("\t" + current);
            early = previous;    // moving the series one step ahead
            previous = current;
        }
    }
}