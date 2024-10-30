
/*
    * สร้าง Method เพื่อ
    1.อ่านข้อมูล
    2.หาผลลัพธ์ตามที่ต้องการ
    No Exception

    ตัวอย่าง
    ANB256POk13  -->2+5+6+1+3=17 -->1+7=8
    1GB./23LU8  -->1+2+3+8=14  -->1+4=5

    หลักการ
    1.ประมวลผลข้อมูลแบบ String
    2.ตรวจสอบทีละตัว ถ้าเป็นตัวเลข นำมาหาผลรวมสะสม
    3.1 ถ้าผลรวมที่ได้มีมากกว่า 1 หลัก กลับไป 1.
    3.2 ถ้าผลรวมที่ได้เป็น 1 หลัก  แสดงผล+จบโปรแกรม   
    
 */

import java.util.*;
public class week13_66011212106 {

    
    String check(String txt) {
        String data_txt = "0";
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isDigit(txt.charAt(i))) {
                data_txt += txt.charAt(i);
            }
        }
        return data_txt;
    }

    void process_number(String txt) {
        int sum = 0;
        for (int i = 0; true; i++) {
            if (txt.length() > 1) {
                if (i == 0) {
                    System.out.print(" - - > ");
                }
                sum += Integer.parseInt(Character.toString(txt.charAt(i))); 
                System.out.print(Integer.parseInt(Character.toString(txt.charAt(i))) +  " + "); 

                if (txt.length() == i + 1) {
                    i = -1;
                    txt = Integer.toString(sum);
                    System.out.print("\b\b ="+" " + txt );
                    
                    sum = 0;
                }
                
            } else 
            {
                System.out.println();
                break;
            }

        }
    }

    public static void main(String[] args) {
        week13_66011212106 mt = new week13_66011212106();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : ");
        String data = scanner.next();
        System.out.print(data);
        /*System.out.print(data.length());*/
        mt.process_number(mt.check(data));
    }
}