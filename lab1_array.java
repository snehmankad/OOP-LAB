public class lab1_array {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);

        for (int i=1; i<args.length-1; i++) {
            for (int j=i+1; j<args.length-1; j++) {
                if((Integer.parseInt(args[i]) + Integer.parseInt(args[j]))==x) {
                    System.out.println(args[i]+"\t"+args[j]);
                    break;
                }
            }
        }
    }
}