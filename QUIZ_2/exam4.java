package QUIZ_2;

import java.util.Scanner;

public class exam4 {
    String lek(String txt) {
        String data[] = txt.split("[ ]");
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data[i].length(); j++) {
                
                int num = data[i].charAt(j);

                bf.append(String.valueOf(num));
            }
            bf.append("+");
        }
        return bf.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exam4 ob = new exam4();
        System.out.print("Enter : ");
        System.out.print(ob.lek(input.nextLine()) + "\b ");

    }
}