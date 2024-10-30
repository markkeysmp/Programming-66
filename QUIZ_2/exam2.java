package QUIZ_2;



import java.util.*;
public class exam2 {
    String processX_txt(String data){
        StringBuffer data_re = new StringBuffer();
        for(int i=0;i<data.length();i++){
            if(i%2 == 0){
                data_re.append(Character.toUpperCase(data.charAt(i)));
            }
            else {
                data_re.append(Character.toLowerCase(data.charAt(i)));
            }
        }
       return data_re.toString();
    }    
 


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    exam2 mt = new exam2();
    System.out.print("Text : ");   
    System.out.print(mt.processX_txt(scanner.nextLine()));
}
}
  