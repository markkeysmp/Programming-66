/*
 * จงเขียนโปรแกรมแสดงผล นาฬิกา(ดิจิตอล) แสดง  ชั่วโมง :นาที: วินาที เพื่อจับเวลา
เริ่มตั้งแต่ ชั่วโมง :นาที:วินาที  ที่     0:0:0  
จบที่         ชั่วโมง :นาที:วินาที  ที่    h:m:s  

โดยที่ h m และ s รับมาจากแป้นพิมพ์
 */

import java.util.Scanner;
public class week6_66011212106 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("H : ");
        int h_time=scanner.nextInt();
        System.out.printf("M : ");
        int m_time=scanner.nextInt();
        System.out.printf("S : ");
        int s_time=scanner.nextInt();

        scanner.close();

        
        int m=0,h=0;
        System.out.printf("H:\tM:\tS:\t\n");
            for(int i=1;;i++){
                
                try{
                    System.out.print("\r\t\t" + i + " " );
                    if(i==60){
                        i=0;
                        m=m+1;
                        System.out.print("\r\t"+ m + " ");
                    }else if(m == 60){
                        m =0 ;
                        h +=1;
                        System.out.print("\r" + h + " ");
                    }
                    if(h == h_time && m == m_time && i == s_time){
                        System.out.println("\nTime out");
                        break;
                    }

                    Thread.sleep(0);
                }catch(InterruptedException ex){
                    
                }
            }       
    }
    }