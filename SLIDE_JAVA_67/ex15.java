package SLIDE_JAVA_67;

import java.util.Random;

public class ex15 {
    public static void main(String[] args) {
        Random random = new Random();
        int evens=0,odds=0;
        for(int i=0;i<10;i++){
            int num = random.nextInt(10)+1;
            System.out.print(num + " ");
            if(num %2 == 0){
                evens++;
            }
            else {
                odds++;
            }
        }
        System.out.println("\n" + evens + " Even numbers");
        System.out.println(odds + " Odd numbers");

        

    }
}
