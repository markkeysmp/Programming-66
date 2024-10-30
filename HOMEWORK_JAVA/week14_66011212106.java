/*

    * จงเขียนโปรแกรม เพื่อประยุกต์ใช้ collection ในการเก็บข้อมูล
    ชื่อ(รับเข้ามา)
    คะแนนกลางภาค (รับเข้ามา)
    คะแนนปลายภาค(รับเข้ามา)
    คะแนนรวม 
    เกรด   (S ถ้าคะแนนรวม >=70  /  U ถ้าคะแนนรวมน้อยกว่า 70)
    ให้สร้าง method ทำหน้ที่ต่อไปนี้ (เป็นอย่างน้อย)
    -รับ+เก็บข้อมูลลงใน collection   ...(name,mid,fin)  
    -หาคะแนนรวม   ..(mid,fin,sum)
    -ตัดเกรด ..(fin,grade)
    -แสดงผล ...(name,mid,fin,sum,grade)

    *** ถ้าป้อนชื่อเป็น stop แสดงว่าการเก็บข้อมูลเสร็จสิ้นแล้ว

 */

import java.util.ArrayList;
import java.util.Scanner;

public class week14_66011212106 {
    static week14_66011212106 mt = new week14_66011212106();

    void data(ArrayList<String> name, ArrayList<Integer> mid_Score, ArrayList<Integer> final_Score) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.print("NAME: ");
            String txt = sc.nextLine();
            if (txt.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("MID SCORE: ");
            int score_m = sc.nextInt();

            System.out.print("FINAL SCORE: ");
            int score_f = sc.nextInt();
            sc.nextLine();  

            name.add(txt);
            mid_Score.add(score_m);
            final_Score.add(score_f);
        }
    }

    void process(ArrayList<String> name, ArrayList<Integer> mid_Score, ArrayList<Integer> final_Score, ArrayList<Integer> sum, ArrayList<String> grades) {
        for (int i = 0; i < name.size(); i++) {
            int totalScore = mid_Score.get(i) + final_Score.get(i);
            sum.add(totalScore);
            processGrade(totalScore, grades);
        }
    }

    void processGrade(int totalScore, ArrayList<String> grade) {
        if (totalScore >= 70) {
            grade.add("S");
        } else {
            grade.add("U");
        }
    }

    void output(ArrayList<String> name, ArrayList<Integer> mid_Score, ArrayList<Integer> final_Score, ArrayList<Integer> sum, ArrayList<String> grades) {
        System.out.println("NAME\tMIDTERM\tFINAL\tSUM\tGrade");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + "\t" + mid_Score.get(i) + "\t" + final_Score.get(i) + "\t" + sum.get(i) + "\t" + grades.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrname = new ArrayList<String>();
        ArrayList<Integer> arrmid = new ArrayList<Integer>();
        ArrayList<Integer> arrfnal = new ArrayList<Integer>();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        ArrayList<String> grades = new ArrayList<String>();

        mt.data(arrname, arrmid, arrfnal);
        mt.process(arrname, arrmid, arrfnal, sum, grades);
        mt.output(arrname, arrmid, arrfnal, sum, grades);
    }
}
