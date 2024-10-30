package SLIDE_JAVA_67;

import java.util.Scanner;
public class ex018 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("N : "); 
        int n = scanner.nextInt();
        String[] name = new String[n];
        int midterscore[] = new int[n];
        int finalscore[] = new int[n];
        int sumscore[] = new int[n];
        int midtermmax = Integer.MIN_VALUE;
        int midtermmin = Integer.MAX_VALUE;
        int finalmax = Integer.MIN_VALUE;
        int finalmin = Integer.MAX_VALUE;
        int sumscoremax = Integer.MIN_VALUE;
        int sumscoremin = Integer.MAX_VALUE;
        char[] grade = new char[n] ;
        for(int i=0;i<n;i++){
            System.out.printf("Name " + (i+1) + " : ");
            name[i] = scanner.next();
            System.out.printf("Midterm Score : ");
            midterscore[i] = scanner.nextInt();
            System.out.printf("Final Score : ");
            finalscore[i] = scanner.nextInt();

            sumscore[i] = midterscore[i] + finalscore[i];

            if(midterscore[i] > midtermmax){
                midtermmax = midterscore[i];
            }
            if(midterscore[i] < midtermmin){
                midtermmin = midterscore[i];
            }
            if(finalscore[i] > finalmax){
                finalmax = finalscore[i];
            }
            if(finalscore[i] < finalmin){
                finalmin = finalscore[i];
            }
            if(sumscore[i] > sumscoremax){
                sumscoremax = sumscore[i];
            }
            if(sumscore[i] < sumscoremin){
                sumscoremin = sumscore[i];
            }
            if(sumscore[i] >=70){
                grade[i] = (char) 'S';
            }
            else
            {
                grade[i] = (char) 'U';
            }
        }
        System.out.printf("NAME\tMidterm\tFinal\tScore\tGrade\n");
        for(int i=0;i<n;i++){
            System.out.print(name+"\t"+midterscore[i] + "\t"+finalscore[i]+"\t"+(midterscore[i]+finalscore[i])+"\t"+grade[i]+"\n");
            
        }
        System.out.print("MIN\t"+midtermmin+"\t"+finalmin+sumscoremin+"\n");
        System.out.print("MAX\t"+midtermmax+"\t"+finalmax+sumscoremax);
        scanner.close();
    }
    
}