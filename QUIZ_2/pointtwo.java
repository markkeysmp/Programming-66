package QUIZ_2;
import java.util.*;

public class pointtwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone numbers: ");
        String phonenumbers = scanner.nextLine(); 
        

        //print ค่าดัชนีพลังงาน 
        String result = calculateEnergy(phonenumbers);
        System.out.println(result);
       
    }
    //ตรวจสอบตัวเลขที่ป้อนเข้ามาว่าครบ10ตัวไหมและมีแค่ตัวเลขเท่านั้น
    static boolean isvalidnumer(String phonenumber){
        return phonenumber.matches("\\d{10}");
     }     

     static int getEnergyIndex(String phonenumber){
        int sum=0;
        //loop แปลง string เป็น int แล้วเอาไปบวกsum
        for(char ch : phonenumber.toCharArray()){
            sum += Character.getNumericValue(ch);
        }
        //ตรวจสอบว่าsum มีค่ามากกว่า10รีป่าว ถ้ามากกว่า10ก็จะใช้ Digits
        while (sum >= 10) { 
            sum = sumDigits(sum);
        }
        return sum;
        
    }
    
    
    static int sumDigits(int number){
        int sum=0;
        //sum%10ก่อน และก็เอา sum/10 ผลลัพธ์2ตัวมาบวกกัน พอน้อยกว่า9แล้วก็จะส่งค่ากลับที่sum
        while (number > 0) {
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
    //ตรวจสอบว่าตัวเลขที่รับเข้ามาถูกต้องไหม ถ้าไม่ใช้จะ print incorrct
    
    static String calculateEnergy(String phonenumber){
    if(!isvalidnumer(phonenumber)){
        return "Incorrect";
    }
    //ถ้าใช้คำนวณหาค่าดัชนีแล้วแปลงเป็นString
    int energyIndex = getEnergyIndex(phonenumber);
    return String.valueOf(energyIndex);

   }

}
