package FINAL_JAVA;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercisetwo {
    static exercisetwo mt = new exercisetwo();

    void inputData(String data,String grades){
          Scanner sc = new Scanner(System.in);
          String fileName = "std.xls";
          try {
              FileWriter fwt = new FileWriter(fileName);
            for(;;){
                System.out.print("NAME : ");
                String name = sc.nextLine();
                if(name.equalsIgnoreCase("stop")){
                    break;
                }
                fwt.write(name+"\t");
                System.out.print("MIDTERM SCORE : ");
                int mid_score = sc.nextInt();
                System.out.print("FINAL SCORE : ");
                int fnal_score = sc.nextInt();
                name = sc.nextLine();
                
                int sum = processSum(mid_score, fnal_score);

                fwt.write(mid_score+"\t");
                fwt.write(fnal_score+"\t");
                fwt.write(sum+"\t");
                fwt.write(processGrade(sum, grades)+"\t\n");
              }
              fwt.close();
          } catch (IOException e) {
            
          }
    }

    int processSum(int mid_score, int fnal_score){
        return mid_score+fnal_score;
    }

    String processGrade(int sum,String grades){
            if(sum >= 70){
                return grades = "S";
            }
            else
            {
                return grades = "U";
            }
            
    }

    public static void main(String[] args){
        mt.inputData(null, null);
        mt.processSum(0, 0);
    }
}