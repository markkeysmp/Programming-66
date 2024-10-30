package SLIDE_JAVA_67;
/* https://drive.google.com/drive/folders/1TPT5RGCMO6R_fVD--M8xezelYYRsLw55 */
// ลิงก์โจทย์ เอาเมลมอออ เข้า 
import java.lang.Math;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("X : ");
        double x=scanner.nextDouble();

        double r=x/2;
        double circle_area = Math.PI*(r*r);
        double traing = 0.5*r*r;
        double white_area = traing*3;
        double gray_area = circle_area-white_area;

        System.out.printf("Circle Area = %.15f\nWhite = %.3f\n",circle_area,white_area);
        System.out.printf("Grat Area = %.15f\n",gray_area);

        scanner.close();

    }
}
