package SLIDE_JAVA_67;

import java.util.Random;
public class ex20 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] A = new int[10];
        int[] B = new int[10];
        boolean[] and = new boolean[10];
            

        for(int i=0;i<10;i++){
            A[i] = random.nextInt(2);
            B[i] = random.nextInt(2);
            if(A[i] == 1 && B[i] == 1 ){
                and[i] = true;
            }
            else
            {
                and[i] = false;
            }
        }
        System.out.println("A : " + java.util.Arrays.toString(A));
        System.out.println("B : " + java.util.Arrays.toString(B));
        System.out.println("AND : " + java.util.Arrays.toString(and));
 


    }
}
