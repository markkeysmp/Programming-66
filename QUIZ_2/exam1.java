package QUIZ_2;

import java.util.*;

public class exam1 {
    int sum_Numbers(String txt){

        int sum=0;
        for(int i=0;i<txt.length();i++){
            if(Character.isDigit(txt.charAt(i))){ //loop ตรวจสอบว่าเป็นตัวเลขหรือป่าว
                sum +=Integer.parseInt(String.valueOf(txt.charAt(i)));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enters Text : ");
        exam1 ob = new exam1();
        System.out.print(ob.sum_Numbers(scanner.nextLine()));
    }
}

 