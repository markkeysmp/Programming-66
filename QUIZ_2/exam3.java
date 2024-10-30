package QUIZ_2;
import java.util.*;
public class exam3 {
    
    String[] prcess(String txt){
        return txt.split("[,/]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exam3 mt = new exam3();
        System.out.print("Enters : ");
        String data[] = mt.prcess(scanner.nextLine());
        
        int n=3;
        for(int i=0;i<data.length;i++){
            if((i+1)==n){
                System.out.print("\n");
                n+=2;
            }
            System.out.print(data[i]+"\t");
        }

    }
}
