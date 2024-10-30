package SLIDE_JAVA_67;

import java.util.Scanner;
public class ex12{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder equation=new StringBuilder();
        int sum=0;
        for(int i=0;i<=10;i++){
            sum += i;
            equation.append(i);
            if(i<10){
                equation.append(" + ");

            }
        }
        System.out.println(equation.append(" = " + sum));
        scanner.close();

    }
}