public class unique_numbers {


/* Limitations: num array length is 70 irrespective of number of combinations possible. 
   Hell lot of variables declared.
*/


    public static void main(String args[]) {

        int[] num = new int[70];    // All combinations to be stored in num array. The maximum number of combinations possible is 64
        
        for (int x=1; x<70; x++) {
            num[x] = 2;             // Assigning 2 as default value to stop traversing through array as soon as 2 appears while checking 
                                    // if the combination has occured before or not
        }
        
        num[0] = 1;                 // keeping the first value different or else the loop to check repitition will never start
        int new_number = 0;
        int key = 0;
        int temp= 0;

        for(int i=0; i<4; i++) {

            for(int j=0; j<4; j++) {
                if(j==i) {continue;}     // to prevent the same number from appearing multiple times, like 555 from 5714
                
                for(int k=0; k<4; k++) {
                   if(k==i || k==j) {continue;}
                                      
                        key = 0;
                        new_number = 100*Character.getNumericValue(args[0].charAt(i))+10*Character.getNumericValue(args[0].charAt(j))+Character.getNumericValue(args[0].charAt(k));

                        for (int l=0; num[l]!=2; l++) {          // to check if the number is appeared before or not
                            if(new_number==num[l]) key = 1;
                            temp = l;                            // just to access l variable outside the for loop
                        }

                        if(key == 0) num[temp+1] = new_number;   // to replace the default value 2 if the combination has never ocurred before                                     
                }
            }
        }

        for(int m=1; num[m]!=2; m++) {
            System.out.println("Number "+m+":  "+num[m]);
        }     
    }
}