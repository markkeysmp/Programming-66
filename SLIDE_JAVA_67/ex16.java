package SLIDE_JAVA_67;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("N : ");
        int n=scanner.nextInt();
        int score,sum=0,sum2=0;
        for(int i=0;i<n;i++){
            System.out.printf("Grade : ");
            char grade=scanner.next().charAt(0);
            System.out.printf("Unit : ");
            int unit=scanner.nextInt();

            if(grade == 'A' || grade == 'a'){
                score = unit*4;
                sum += unit;
                sum2 += score;
            }
            else if(grade == 'B' || grade == 'b'){
                score = unit*3;
            }
        }
        System.out.println("SUM of unit = " + sum);
        System.out.println("Sum_ig x u = " + sum2);
        scanner.close();
    }
}
