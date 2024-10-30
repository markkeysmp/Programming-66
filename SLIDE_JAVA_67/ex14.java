package SLIDE_JAVA_67;

import java.util.Scanner;
import java.util.Random;
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String eo;
        for(int i=0;i<10;i++){
            int num = random.nextInt(10)+1;
            System.out.print(num + " ");
            if(num %2 == 0){
                eo = "EVEN";
                System.out.println(" " + eo);
            }
            else{
                eo = "ODD";
                System.out.println(" " + eo);
            }
        }


        scanner.close();
    }
}
