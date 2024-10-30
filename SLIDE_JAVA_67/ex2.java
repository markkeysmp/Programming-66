package SLIDE_JAVA_67;
/* https://drive.google.com/drive/folders/1TPT5RGCMO6R_fVD--M8xezelYYRsLw55 */
// ลิงก์โจทย์ เอาเมลมอออ เข้า 
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Widht : ");
        Double width=scanner.nextDouble();
        System.out.printf("Lenght : ");
        Double lenght=scanner.nextDouble();
        System.out.printf("Height: ");
        Double height=scanner.nextDouble();

        double area,pay;
        area = ((width*2)+(lenght*2))*height;
        pay = area*25.25;

        System.out.printf("Area = %.0f\nPay = %.2f",area,pay);


        scanner.close();
    }
}
