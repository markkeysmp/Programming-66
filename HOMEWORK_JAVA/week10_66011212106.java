/*

 *  1.สร้าง array ขาด NxN
    2.รับ menu (O/X/E)
    -ถ้าเป็น O หรือ X รับตำแหน่งที่จะเติม แล้วเติมในตำแหน่งที่ต้องการ
    -ถ้าเป็น E จบโปรแกรม

* ตรวจสอบว่าถ้าตำแหน่งที่ต้องการเติม มี O/X อยู่แล้ว จะเติมไม่ได้แล้วแจ้งเตือน เพื่อเติมใหม่
**ห้ามเกิด ArrayIndexOutOfbuondException


 */


import java.util.*;

public class week10_66011212106 {
    public static void main(String[] args) {
        {
        //สร้างตัวเอาไว้ใช้ดึงmethod
        week10_66011212106 mt = new week10_66011212106();

        //รับขนาดของarr = n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N : ");
        int n = scanner.nextInt();
        scanner.close();
        char arr[][] = new char[n][n];

        //ดึง method มาใช้
            mt.fill_(arr);
            mt.printBoard(arr);
            mt.menuXo(arr);
        }

    }
    //method สร้างแถว
    void printBoard(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.printf(arr[i][j]+ "\t");
            }
            System.out.print("\n");
        }
    }

    void fill_(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = '_';
            }
        }
    }
    void setX(char arr[][]){
        week10_66011212106 mt = new  week10_66011212106();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rows : ");
        int rows = scanner.nextInt();
        System.out.print("colump : ");
        int colump = scanner.nextInt();
        scanner.close();
            if(rows<arr.length && colump<arr.length){
                if(arr[rows][colump] != 'X' || arr[rows][colump] !='O'){
                    arr[rows][colump] = 'X';
                    mt.printBoard(arr);
                }
            }
    }
    void setO(char arr[][]){
        week10_66011212106 mt = new  week10_66011212106();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rows : ");
        int rows = scanner.nextInt();
        System.out.print("colump : ");
        int colump = scanner.nextInt();
        scanner.close();
            if(rows<arr.length && colump<arr.length){
                if(arr[rows][colump] != 'X' || arr[rows][colump] !='O'){
                    arr[rows][colump] = 'O';
                    mt.printBoard(arr);
                }
            }
    }   
    void menuXo(char arr[][] ){
        week10_66011212106 mt = new  week10_66011212106();
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        char menu= 'B';
        for(;menu != 'E' || menu != 'e';){  
                System.out.print("MENO X/O : ");
                menu = scanner.next().charAt(0);

                if(menu == 'X' || menu == 'x'){
                    mt.setX(arr);
                }
                else if(menu == 'O' || menu == 'o'){
                    mt.setO(arr);
                }
                else if(menu =='E' || menu == 'e'){
                    break;
                }
              }
              
    }
}