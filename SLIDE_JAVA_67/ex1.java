package SLIDE_JAVA_67;

/* https://drive.google.com/drive/folders/1TPT5RGCMO6R_fVD--M8xezelYYRsLw55 */
// ลิงก์โจทย์ เอาเมลมอออ เข้า 

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args ){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Price Market : ");
        int price_market=scanner.nextInt();
        System.out.printf("Rice kiloTun : ");
        double tun=scanner.nextDouble();
        double kg = tun*1000;
        double sell,compensate,moneyall;
        if(price_market<=15)
        {
            sell = kg*price_market;
            compensate = kg*3.25;
            moneyall = sell+compensate;
        }
        else
        {
            sell = kg*price_market;
            compensate = kg*0.73/100;
            moneyall = sell+compensate;
        }
        System.out.printf("Sell Rice = %.0f\nCompensate Money = %.0f\nMoney All = %.0f",sell,compensate,moneyall);
        scanner.close();
        
    }
}
