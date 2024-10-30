package SLIDE_JAVA_67;
/* https://drive.google.com/drive/folders/1TPT5RGCMO6R_fVD--M8xezelYYRsLw55 */
// ลิงก์โจทย์ เอาเมลมอออ เข้า 
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Mango : ");
        double mango = scanner.nextInt();
        double rambutan,longan,sum;

        rambutan = mango/0.27;
        longan = mango*0.85;
        sum=mango+rambutan+longan;

        System.out.printf("Rambutan = %.1f\nMango = %.0f\nLongan = %.2f\nSum = %.2f",rambutan,mango,longan,sum);

        scanner.close();
    }
}
