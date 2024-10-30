package QUIZ_2;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class pointone {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM YYYY \nHH:mm:ss a");
        
        System.out.println("DATA " + sdf.format(calendar.getTime()));

        int day = calendar.get(Calendar.DAY_OF_MONTH);//ดึงวันปัจจุบัน
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); //ดึงวันสิ้นสุดของเดือน
        
        System.out.print("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        
        
        calendar.set(Calendar.DAY_OF_MONTH, 1); //กำหนดให้เป็นวันที่1ของเดือนปัจจุบัน
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) -1; //เอาไว้หาวันที่เราจะเริ่มไม่ใช่วันที่-1จะเพิ่มไปข้างหน้า +1จะถอยหลัง

        // \t จนกว่าจะถึงวันปัจจุบัน
        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }
        
        //ให้มันเริ่มวันปัจจุบัน
        for (int i = 0; i <= maxDay; i++) {
            if (i < day) {
                System.out.print("\t");
            } else {
                System.out.print(i + "\t");
            }
            if ((i + startDay) % 7 == 0) { //ให้มันขึ้นวันใหม่หลังถึงวันเสาร์
                System.out.println();
            }
        }
        
    }
}
