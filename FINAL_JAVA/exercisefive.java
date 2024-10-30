package FINAL_JAVA;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercisefive {
    private Set<Integer> dataSet;

    public exercisefive(){
        dataSet = new HashSet<>();
    }
    
    void addData(int data){
        if(dataSet.add(data)){
            System.out.print("data add Successfully.");
        }
        else
        {
            System.out.print("Data already exits.");
        }
    }   
    void deleteData(int data){
        if(dataSet.remove(data)){
            System.out.print("data remove Successfully.");
        }
        else
        {
            System.out.print("data not found.");
        }
    }
    void editsdata(int oldData,int newData){
        if(dataSet.contains(oldData)){
            dataSet.remove(oldData);
            dataSet.add(newData);
            System.out.print("Data updated seuccessfully.");
        }
        else
        {
            System.out.print("Old data found.");
        }
    }
    void searchData(int data){
        if(dataSet.contains(data)){
            System.out.print("Data found : " + data);
        }
        else 
        {
            System.out.print("Data not found. ");
        }
    }

    void displayData(){
        System.out.print("Currect data in the set : " + dataSet);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercisefive mt = new exercisefive();
        boolean exit = false;   
        while ((!exit)) {
            System.out.println("\n[A] Add data ");
            System.out.println("[D] Delete data ");
            System.out.println("[E] Edit data ");
            System.out.println("[S] Search data ");
            System.out.println("[E] Exits ");
            System.out.print("Select Choice : ");
            char choice = sc.next().toUpperCase().charAt(0);

            if(choice  == 'A'){
                System.out.print("Add data : ");
                int addData = sc.nextInt();
                mt.addData(addData);
                mt.displayData();
            }
            else if(choice == 'D'){
                System.out.print("Delete data : ");
                int deleteData = sc.nextInt();
                mt.deleteData(deleteData);
                mt.displayData();
            }
            else if(choice == 'E'){
                System.out.print("Edit data : ");
                int oldData = sc.nextInt();
                System.out.print("Enter new data : ");
                int newData = sc.nextInt();
                mt.editsdata(oldData, newData);
                mt.displayData();
            }
            else if(choice == 'S'){
                System.out.print("Search data : ");
                int searchData = sc.nextInt();
                mt.searchData(searchData);
            }
            else if(choice == 'X'){
                System.out.print("Exit program....");
                exit = true;
            }
            else
            {
                System.out.println("Invalid choice! Please try again..");
            }

        }
    }
}
