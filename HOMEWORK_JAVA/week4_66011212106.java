
//โจทย์ จงเขียนโปรแกรมรับวันที่ของ ปี (1-90) แล้วแสดง ชื่อวัน-ชื่อเดือน และวันที่ของเดือนๆนั้น ตามปฏิทินที่กำหนดให้


import java.util.Scanner;
public class week4_66011212106 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Numbers : ");
        int number = scanner.nextInt();
        int days = number%7;
        String day;
        switch (days) {
            case 1:
                day = "TUE";
                break;
            case 2:
                day = "WED";
                break;
            case 3:
                day = "THR";
                break;
            case 4:
                day = "FRI";
                break;
            case 5:
                day = "SAT";
                break;
            case 6:
                day = "SUN";
                break;
            case 0:
                day = "Mon";
                break;
            default:
                day = "Invalidate";
                break;
        }
        String month;
        int date;
        if(number>=1&&number<=31)
        {
            month = "JAN";
            date = number-0;
            System.out.println("Day : " + day + "\tMonth : " + month + "\tDate : " + date);
        }
        else if(number>=32&&number<=59)
        {
            month = "FEB";
            date =  number-31;
            System.out.println("Day : " + day + "\tMonth : " + month + "\tDate : " + date);
        }
        else if(number>=60&&number<=90)
        {
            month = "MAR";
            date =  number-59;
            System.out.println("Day : " + day + "\tMonth : " + month + "\tDate : " + date);
        }
        scanner.close();
    }
}