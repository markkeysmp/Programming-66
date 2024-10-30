package SLIDE_JAVA_67;

import java.util.Scanner;
import java.util.Random;
public class ex019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.printf("N : ");
        int n = scanner.nextInt();
        
        int data[][] = new int[n][n];
        double dataAverage[][] = new double[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            data[i][j] = random.nextInt(10)+1;
            }
        }
        
        for(int i=0;i<n;i++){
            double sum=0;
            for(int j=0;j<n;j++){
                sum += data[i][j];
            }
            double rowAverage = sum/n;
            for(int j=0;j<n;j++){
                if(j == i){
                    dataAverage[i][j] = rowAverage;
                }else
                {
                    dataAverage[i][j] = 0;
                }
            }
        }

        System.out.printf("DATA : \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.printf("\n");
        }

        System.out.printf("DATA_AVERAGE: \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(dataAverage[i][j] + " ");
            }
            System.out.printf("\n");
        }
        scanner.close();
    }
}
