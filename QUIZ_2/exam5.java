package QUIZ_2;

import java.util.*;
public class exam5 {
int process_num (String txt){
    txt = txt.replace("/0", "");
    txt = txt.replace("%0", "");
    String datanum[] = txt.split("[+-/*%]");
    int index=0;
    int data_rt = Integer.parseInt(datanum[0]);
    for(int i=0;i<datanum.length-1;i++){
        index+=datanum[i].length();
        if(i!=0){
            index+=1;
        }
        char operator = txt.charAt(index);
        int num = Integer.parseInt(datanum[i+1]);
        if(operator == '+'){
            data_rt += num;
        }
        else if(operator == '-'){
            data_rt -= num;
        }
        else if(operator == '*'){
            data_rt *= num;
        }
        else if(operator == '/'){
            data_rt /= num;
        }
        else if(operator == '%'){
            data_rt %= num;
        }
    }
    return data_rt;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exam5 mt = new exam5();
        System.out.print("Enters Text : ");
        System.out.print(mt.process_num(scanner.nextLine()));
    }
}