
/* https://docs.google.com/document/d/1yFJu5lXEI5Z7yO2lSYdJ76ng6Z-4lOSUH8W7b-F4Uo8/edit?tab=t.0 */ 

//เอาลิงก์ไปวาง คือ โจทย์

import java.util.*;

// import javax.xml.bind.annotation.W3CDomHandler;

public class Week12_66011212106 {
    static Week12_66011212106 mt = new Week12_66011212106();

    boolean check_data(String data) {
        //ลบตัวที่ไม่ใช่ตัวเลข
        data = data.replaceAll("[^\\d]", "");
        if (data.length() != 13) {
            return false;
        }
        //loopเช็คว่าเป็นตัวเลขไหม
        for (int i = 0; i < 13; i++) {
            if (!Character.isDigit(data.charAt(i))) {
                return false;
            }
        }
        return process_one(data, Integer.parseInt(Character.toString(data.charAt(12))));
    }
    //นำข้อมูลมาคูณ
    boolean process_one(String data, int f_number) {
        int sum[] = new int[12], amount = 13;
        for (int i = 0; i < amount - 1; i++) {
            sum[i] = (amount - 1 - i) * (Integer.parseInt(Character.toString(data.charAt(i))));
        }
        return process_two(sum, f_number);
    }
    //นำผลคูณมาบวก
    boolean process_two(int[] data, int f_number) {
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum = sum + data[i];
        }
        return process_three(sum, f_number);
    }
    //นำผลรวมมา mpd
    boolean process_three(int sum, int f_number) {
        int mod = sum % 11;
        return process_four(mod, f_number);
    }
    //นำผลmodมาลบกับ 11
    boolean process_four(int mod, int f_number) {
        int del = 11 - mod;
        return process_five(del, f_number);
    }
    boolean process_five(int del, int f_number) {
        if (del > 9) {
            char num_1 = Integer.toString(del).charAt(1); 
            int num_2 = Integer.parseInt(Character.toString(num_1));
            if (num_2 == f_number) {
                return true;
            } 
            else {
                return false;
            }
        } else if (del >= 0) {
            if (del == f_number) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //รับค่า
        Scanner scanner = new Scanner(System.in);
        Week12_66011212106 mt = new Week12_66011212106();

        System.out.print("Enter Number: ");
        String input_id = scanner.nextLine();

        //output
        boolean result = mt.check_data(input_id);
        System.out.println(result);
    }
}