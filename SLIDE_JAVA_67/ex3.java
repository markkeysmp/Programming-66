package SLIDE_JAVA_67;
/* https://drive.google.com/drive/folders/1TPT5RGCMO6R_fVD--M8xezelYYRsLw55 */
// ลิงก์โจทย์ เอาเมลมอออ เข้า 
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Rice (KG) : ");
        int rice=scanner.nextInt();

        int packaging,remaining;

        packaging = rice/12;
        remaining = rice%12;

        System.out.println("Packaging = " + packaging + "\nRemaining = " + remaining);
        scanner.close();
    }
}
