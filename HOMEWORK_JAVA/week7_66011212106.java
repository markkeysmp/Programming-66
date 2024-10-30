
//จงเขียนโปรแกรมเพื่อประยุกต์ใช้งาน array ดังต่อไปนี้
import java.util.Scanner;

public class week7_66011212106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("N : ");
        int n = scanner.nextInt();
        String[] name = new String[n];

        int[] sale1 = new int[n];
        int[] sale2 = new int[n];
        int[] total = new int[n];
        double[] com = new double[n];
        String[] text = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Name : ");
            name[i] = scanner.next();
            System.out.printf("Sale_1 : ");
            sale1[i] = scanner.nextInt();
            System.out.printf("Sale_2 : ");
            sale2[i] = scanner.nextInt();
            total[i] = sale1[i] + sale2[i];
            com[i] = (double) total[i] * 0.125;
            if (com[i] <= 1000) {
                text[i] = "  No Level";
            } else if (com[i] <= 9999) {
                text[i] = "  Platinum";
            } else if (com[i] <= 50000) {
                text[i] = "  Gold";
            } else {
                text[i] = "  Diamond";
            }

        }
        System.out.println("\nNAME\t" + "SALE\t" + "SALE_2\t" + "Total\t" + "Com\t" + "\tLevel ");
        for (int i = 0; i < n; i++) {
            System.out.printf(name[i] + "\t" + sale1[i] + "\t" + sale2[i] + "\t" + total[i] + "\t" + com[i] + " \t" + text[i] + "\n");
        }
        scanner.close();
    }
}