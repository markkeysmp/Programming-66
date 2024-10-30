package FINAL_JAVA;


import java.util.*;
public class exercisefour {

    String check(String txt){
        String data_txt = "";
        for(int i=0;i<txt.length();i++){
            if(Character.isDigit(txt.length())){
                data_txt += txt.charAt(i);
            }
        }
        return data_txt;
    }

    void process(String txt){
         int sum=0;
         for(int i=0;true;i++){
            if(txt.length() > 1){
                if(i == 0){
                    System.out.print(" - - - > ");
                }
                sum+=Integer.parseInt(Character.toString(txt.charAt(i)));
                System.out.print(Integer.parseInt(Character.toString(txt.charAt(i)))+ " + ");

                if(txt.length() == i+1){
                    i = -1;
                    txt = Integer.toString(sum);
                    System.out.print("\b\b ="+" " + txt);
                    sum=0;
                }
            }
            else
            {
                System.out.println();
                break;  
            }
         }
    }

    public static void main(String[] args) {
        
    }
}