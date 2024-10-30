package SLIDE_JAVA_67;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double sum=0,avg=0;
        for(int i=0;i<5;i++){
            System.out.printf("Enters number : ");
            int number=scanner.nextInt();

            sum+=number;
        }
        avg=sum/5;
        System.out.printf("SUM = %.0f\nAverage = %.2f ",sum,avg);
        scanner.close();

    }
}
