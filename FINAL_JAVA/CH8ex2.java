package FINAL_JAVA;

//import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class CH8ex2{
    LinkedList<Integer> list;
    Scanner sc;
    CH8ex2() {
        list = new LinkedList<>();
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        CH8ex2 Begin = new CH8ex2();
        Begin.Menu();
    }
    void Menu(){
        char choice;
        try{
        do{
            System.out.println("\n[F] Adding First");
            System.out.println("[L] Adding Last");
            System.out.println("[B] Adding Before");
            System.out.println("[A] Adding After");
            System.out.println("[D] Deleting Data");
            System.out.println("[S] Searching...");
            System.out.println("[X] Exiting Program...");
            
            choice = sc.nextLine().toUpperCase().charAt(0);
            switch (choice) {
                case 'F':
                    inputFirst();break;
                case 'L':
                    inputLast();break;
                case 'B':
                    inputBefore();break;
                case 'A':
                    inputAfter();break;
                case 'D':
                    inputDelete();break;
                case 'S':
                    SearchData();
                case 'X': break;
                    default:
                    System.out.println("Invalid Choice Try Again :D");
            }
        }while(choice != 'X');
        sc.close();
        
        }catch(InputMismatchException input){
            System.out.println("Error : InputMismatchException");
        }catch(Exception exception){
            System.out.println("Error : Exception");
        }
    }
    void inputFirst(){
        System.out.print("Enter Integer Add First :");
        int Datafirst = sc.nextInt();
        list.addFirst(Datafirst);
        System.out.println("Add First Successfully :");
        sc.nextLine();
    }
    void inputLast(){
        System.out.print("Enter Integer Add Last :");
        int Datalast = sc.nextInt();
        list.addLast(Datalast);
        System.out.println("Add Last Successfully :");
        sc.nextLine();
    }
    void inputBefore(){
        System.out.print("Enter Data to Add Before :");
        int beforedata = sc.nextInt();
        System.out.print("Enter the Data to Add :");
        int newdata = sc.nextInt();
        if (list.contains(beforedata)) {
            int index = list.indexOf(beforedata);
            list.add(index, newdata);
            System.out.println("Add Data before successfully  :");
        }else{
            System.out.println("Not Found Data in the List :D");
        }
        sc.nextLine();
    }
    void inputAfter(){
        System.out.print("Enter Data to Add After :");
        int afterdata = sc.nextInt();
        System.out.print("Enter the Data to Add :");
        int newdata = sc.nextInt();
        if (list.contains(afterdata)) {
            int index = list.indexOf(afterdata);
            list.add(index+1, newdata);
            System.out.println("Add Data after successfully  :");
        }else{
            System.out.println("Not Found Data in the List :D");
        }
        sc.nextLine();
    }
    void inputDelete(){
        System.out.print("Enter Data to Delete :");
        int deleteData = sc.nextInt();
        if(list.contains(deleteData)){
            System.out.print("Enter new Data :");
            int newData = sc.nextInt();
            int index = list.indexOf(deleteData);
            list.set(index,newData);
            System.out.println("Delete Data successfully  :");
        }else{
            System.out.println("Not Found Data in the List :D");
        }
        sc.nextLine();
    }
    void SearchData(){
        System.out.print("Enter Data to Search :");
        int searchData = sc.nextInt();
        int count=0;
        for(Integer num : list){
            if(num == searchData){
                count++;
            }else{
                System.out.println("Didn't Have Data in the List :D");
            }
        }
        System.out.println("Integer Success Data is :"+searchData+" in list :"+count);
        sc.nextLine();
    }
}