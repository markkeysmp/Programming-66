import java.util.Scanner;
public class week2_66011212106 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Widht = ");
        double width=scanner.nextDouble();
        System.out.printf("Lenght = ");
        double length=scanner.nextDouble();
        System.out.printf("Height = ");
        double height=scanner.nextDouble();

        double area=((width*2)+(length*2))*height;
        double pay = area*25.25;
        scanner.close();
        System.out.printf("Area = %.1f\nPay = %.2f Bath.",area,pay);

    }
}