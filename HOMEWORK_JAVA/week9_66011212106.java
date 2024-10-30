
/*
 จงเขียนโปรแกรมเพื่อหาพื้นที่ 3 เหลี่ยมใดๆ ด้วย Heron's Formula โดยการรับค่าพิกัด x, y ของจุดทั้ง 3 ของสามเหลี่ยมใดๆ
โดยสร้าง อย่างน้อย 3 method เพื่อหา
1.ความยาวด้านของสามเหลี่ยมแต่ละด้าน จากพิกัดของจุด
2.ค่า S จาก Heron's Formula
3.พื้นที่จาก Heron's Formula
 */


import java.util.*;
public class week9_66011212106 {
    public static void main(String[] args) {
        week9_66011212106 ki = new week9_66011212106();
        int x1 = ki.input("x1 : ");
        int y1 = ki.input("y1 : ");
        int x2 = ki.input("x2 : ");
        int y2 = ki.input("y2 : ");
        int x3 = ki.input("x3 : ");
        int y3 = ki.input("y3 : ");
        double sideA = ki.sidelength1(x1,y1,x2,y2);
        double sideB = ki.sidelength1(x2,y2,x3,y3);
        double sideC = ki.sidelength1(x3,y3,x1,y1);
        double S = ki.S(sideA,sideB,sideC);
        double area = ki.area(S,sideA,sideB,sideC);
        ki.print("a(Q,W) : ", sideA);
        ki.print("b(W,E) : ", sideB);
        ki.print("a(E,Q) : ", sideC);
        ki.print("S : ", S);
        ki.print("Area : ",area);
    }
    int input(String rrak){
        Scanner input = new Scanner(System.in);
        System.out.print(rrak);
        int x1 = input.nextInt();
        input.close();
        return x1;
    }
    double sidelength1(int x1,int y1, int x2, int y2){
        double side_a = Math.sqrt(Math.pow(x1-x2 ,2) + Math.pow(y2 - y1 ,2));
        return side_a;
    }
    double S (double sideA, double sideB, double sideC){
        double S = (sideA+sideB+sideC)/2;
        return S;
    }
    double area (double S, double sideA, double sideB, double sideC){
        double area = Math.sqrt(S*(S-sideA)*(S-sideB)*(S-sideC));
        return area;
    }
    void print(String rrak,double num){
        System.out.println(rrak+num);
    }
}