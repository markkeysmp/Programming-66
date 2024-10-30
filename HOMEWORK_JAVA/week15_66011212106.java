/*
    * จงเขียนโปรแกรม เพื่อประยุกต์ใช้  การ เขียน/อ่าน ข้อมูลกับไฟล์ std.xls โดยเก็บข้อมูล
    ชื่อ(รับเข้ามา)
    คะแนนกลางภาค (รับเข้ามา)
    คะแนนปลายภาค(รับเข้ามา)
    คะแนนรวม 
    เกรด   (S ถ้าคะแนนรวม >=70  /  U ถ้าคะแนนรวมน้อยกว่า 70)
    *** ถ้าป้อนชื่อเป็น stop แสดงว่าการเก็บข้อมูลลงไฟล์เสร็จสิ้น แล้ว ให้อ่านข้อมูลทั้งหมดมาแสดงผล
 */


import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class week15_66011212106 {
    static week15_66011212106 mt = new week15_66011212106();
    
    void inputdata(String data,String grades){
        String file = ("data.xls");
       Scanner sc = new Scanner(System.in);
         try {
            FileWriter fwt = new FileWriter(file);
            fwt.write("NAME\tMID\tFINAL\tSUM\tGRADE\n");
            
            for(;;){
                System.out.print("NAME : ");
                String name=sc.nextLine();
                if(name.equalsIgnoreCase("stop")){
                    break;
                }
                fwt.write(name+"\t");
                System.out.print("MIDTERM SCORE : ");
                int midterm_score = sc.nextInt();

                System.out.print("FINAL SCORE : ");
                int fnal_score = sc.nextInt();

                int sum=0;
                sum = midterm_score+fnal_score;
                
                name=sc.nextLine();

                fwt.write(midterm_score+"\t");
                fwt.write(fnal_score+"\t");
                fwt.write(sum+"\t");
                fwt.write(processGeade(sum, grades)+"\t\n");
            }
            fwt.close();
        } 
        catch (IOException e) {
            
        }

    }
    String processGeade(int sum, String grades){
        if(sum>=70){
            grades = "S";
        }
        else
        {
            grades = "U";
        }
        return grades;
    }
   


    public static void main(String[] args) {
        mt.processGeade(0, null);
        mt.inputdata(null, null);
    }
}