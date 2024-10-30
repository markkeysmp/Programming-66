package SLIDE_JAVA_67;

import java.util.Random;
public class ex10 {
    public static void main(String[] args) {
        Random random=new Random();

        int number=random.nextInt(6)+1;

        System.out.println(number);
    }
}
