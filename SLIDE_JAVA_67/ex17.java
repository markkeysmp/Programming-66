package SLIDE_JAVA_67;

import java.util.Random;

public class ex17 {
    public static void main(String[] args) {
        
        Random random = new Random();

       for(int i=0; i<10;i++){
        int unicode = random.nextInt(26)+65;
        char randomChar = (char) unicode;

        System.out.printf(randomChar + " ");
       }

    }
}
