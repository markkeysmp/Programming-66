//เขียนโปรแกรมคำนวณเกรดเฉลี่ย n วิชา


import java.util.Scanner;

public class week5_66011212106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ig,unit;
        char grade;
        double sum=0,sum2=0,gpx,score;
        System.out.printf("N : ");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.printf("Grade : ");
            grade = scanner.next().charAt(0);

            System.out.printf("Unit : ");
            unit = scanner.nextInt();

            if(grade == 'A' || grade == 'a'){
                score = unit*4;
                sum = sum+unit;
                sum2 = sum2+score;
            }
            else if(grade == 'B' || grade == 'b'){
                score = unit*3;
                sum = sum+unit;
                sum2 = sum2+score;
            }else if(grade == 'C' || grade == 'c'){
                score = unit*2;
                sum = sum+unit;
                sum2 = sum2+score;
            }
            else if(grade == 'D' || grade == 'd'){
                score = unit*1;
                sum = sum+unit;
                sum2 = sum2+score;
            }
            else if(grade == 'F' || grade == 'f'){
                score = unit*0;
                sum = sum+unit;
                sum2 = sum2+score;
            }else
            {
                continue;
            }
        }
        gpx = sum2/sum;
        System.out.println("Unit Sum : " + sum);
        System.out.println("Sum_IG x U = " + sum2);
        System.out.printf("GPAX = %.3f\n",gpx);
        scanner.close();
    }
}