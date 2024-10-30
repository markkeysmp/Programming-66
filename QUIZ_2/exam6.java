package QUIZ_2;

import java.util.*;

public class exam6 {

    boolean checkN(String data){
            return Character.toLowerCase(data.charAt(0)) ==
             Character.toLowerCase(data.charAt(data.length() -1));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exam6 ob = new exam6();
        System.out.printf("Enters : ");
        System.out.print(ob.checkN(scanner.nextLine()));
    }

    
}
