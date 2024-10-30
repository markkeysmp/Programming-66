package SLIDE_JAVA_67;

import java.util.Random;
public class ex11 {
    public static void main(String[] args)
    {
        Random random=new Random();

        int sum=0;
        for(int i=0;i<=3;i++)
        {
            int numbers=random.nextInt(6)+1;
            sum +=numbers;
        }
        if(sum<=10)
        {
            System.out.println("Sum : "+ sum +"\n-Low-");
        }
        else if(sum == 11)
        {
            System.out.println("Sum : "+ sum +"\n-Middle-");
        }
        else
        {
            System.out.println("Sum : "+ sum +"\n-HIGH-");
        }
    }
}
