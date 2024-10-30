package FINAL_JAVA;

import java.util.Scanner;
import java.util.ArrayList;
public class exerisethree {
    static exerisethree mt = new exerisethree();

    void inputdata(ArrayList<String>name,ArrayList<Integer>midterm,ArrayList<Integer>fnal){
            Scanner sc = new Scanner(System.in);
            for(;;){
                System.out.print("NAME : ");
                String txt = sc.nextLine();
                if(txt.equalsIgnoreCase("stop")){
                    break;
                }
                System.out.print("MIDTERM SCORE : ");
                int mid_score = sc.nextInt();
                System.out.print("FINAL SCORE : ");
                int fnal_score = sc.nextInt();
                sc.nextLine();


                name.add(txt);
                midterm.add(mid_score);
                fnal.add(fnal_score);

            }
    }
    void process(ArrayList<String>name,ArrayList<Integer>midterm,ArrayList<Integer>fnal,ArrayList<Integer>sum,ArrayList<String>grade){
         for(int i=0;i<name.size();i++ ){
            int totalScore = midterm.get(i)+fnal.get(i);
            sum.add(totalScore);
            processgrade(totalScore, grade);
         }
    }

    void processgrade(int totalScore,ArrayList<String>grade){
            if(totalScore>=70){
                grade.add("S");
            }
            else
            {
                grade.add("U");
            }
    }

    void output(ArrayList<String>name,ArrayList<Integer>midterm,ArrayList<Integer>fnal,ArrayList<Integer>sum,ArrayList<String>grade){
        for(int i=0;i<name.size();i++){
            System.out.print(name.get(i)+"\t"+midterm.get(i)+"\t"+fnal.get(i)+"\t"+sum.get(i)+"\t"+grade.get(i)+"\t\n");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrname = new ArrayList<String>();
        ArrayList<Integer> arrmid = new ArrayList<Integer>();
        ArrayList<Integer> arrfnal = new ArrayList<Integer>();
        ArrayList<Integer> arrsum = new ArrayList<Integer>();
        ArrayList<String> grades = new ArrayList<String>();

        mt.inputdata(arrname, arrmid, arrfnal);
        mt.process(arrname, arrmid, arrfnal, arrsum, grades);
        mt.output(arrname, arrmid, arrfnal, arrsum, grades);
        mt.processgrade(0, arrname);

    }
}