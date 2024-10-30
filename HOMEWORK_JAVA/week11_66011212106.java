

// จงเขียนโปรแกรมรับข้อมูล(input) แล้วสร้าง method เพื่อหาผลลัพธ์ตาม Sample output

import java.util.*;

public class week11_66011212106 {
    

    //นับจำนวนตัวเลขในประโยค
    int num(String txt){
        String str = txt;
        int num=0;
        char[] array = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char p = txt.charAt(i);
            boolean dig = Character.isDigit(p);
            if(dig==true){
                num++;
            }
        }
        return num;

    }
    
//นับอักษรตัวเล็ก
    int low(String txt){
        String str = txt;
        int numl=0;
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char l = txt.charAt(i);
            boolean lows = Character.isLowerCase(l);
            if(lows==true){
                numl++;
            }
        }
        return numl;
    }

//นับอักษรตัวใหญ่
    int upper(String txt){
        String str = txt;
        int numup=0;
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char u = txt.charAt(i);
            boolean lows = Character.isUpperCase(u);
            if(lows==true){
                numup++;
            }
        }
        return numup;

    }
    //นับจำนวนคำของประโยค
    int word(String txt){
        String str = txt;
        String words[] = str.split("s+");
        int str_word = words.length;

        return str_word;
    }
    //method output
    void out(String txt){
        week11_66011212106 mt = new week11_66011212106();
        System.out.println(mt.num(txt)+" Numeric");
        System.out.println(mt.low(txt)+" LowerCase");
        System.out.println(mt.upper(txt)+" Uppercase");
        System.out.println(mt.word(txt)+ " Words");
      
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        week11_66011212106 mt = new week11_66011212106();
        System.out.printf("Text  : ");
        String txt=scanner.nextLine();

        mt.out(txt);

        //Hello my name is Supoat Wongsa I was born 1976 I have 36 years old. 

    }   
}