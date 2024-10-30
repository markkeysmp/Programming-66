package SLIDE_JAVA_67;


import java.util.Scanner;
public class ex7 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Text : ");
        String text=scanner.nextLine();
        String g;
        if(text.equalsIgnoreCase("excellent"))
        {
            g = "Grade A ";            
        }
        else if(text.equalsIgnoreCase("good"))
        {
            g = "Grade B";
        }else if(text.equalsIgnoreCase("fair"))
        {
            g = "Grade C";
        }else if(text.equalsIgnoreCase("pass"))
        {
            g = "Grade D";
        }else if(text.equalsIgnoreCase("fail"))
        {
            g = "Grade F";
        }else
        {
            g = "Have not Grade";
        }
        System.out.println(g);

        scanner.close();
    }
}
