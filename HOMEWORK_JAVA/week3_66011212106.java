import java.util.Scanner;
public class week3_66011212106 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        

        System.out.printf("Price Market : ");
        double price_market=scanner.nextDouble();

        System.out.printf("TUN Rice : ");
        double tun=scanner.nextDouble();
        double kg=tun*1000;
        double sell=kg*price_market;
        
        double Compensation=0,money_all=0;

        if(price_market<=15)
        {
            Compensation = kg*3.25;
            money_all = Compensation+sell;
            
        }
        else
        {
            Compensation = kg*(0.73/100);
            money_all = sell+Compensation;
        }
        System.out.printf("Sell Rice = %.2f\nCompensation = %.2f\nMoney_All = %.2f\n",sell,Compensation,money_all);
        scanner.close();

    }
}