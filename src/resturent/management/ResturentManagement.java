
package resturent.management;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.sql.*;
public class ResturentManagement {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("::: Resturent Management :::");
       
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Login as: \n1.Admin \n2.User \n3.Exit");
            int option = input.nextInt();
            if(option == 1) {
                
                    Scanner input2 = new Scanner(System.in);
            System.out.println("\n1.Add Food \n2.Order List \n3.Update Food \n4.Delete Food");
            int option1 = input2.nextInt();
            switch (option1) {
                case 1:
                    DbConnect connec = new DbConnect();
                    connec.insertData();
                    continue;
                case 2:
                    DbConnect connect = new DbConnect();
                    connect.getData();
                    continue;
                case 3:
                    DbConnect connecte = new DbConnect();
                    connecte.upDate();
                    continue;    
                case 4:
                    DbConnect connected = new DbConnect();
                    connected.delete();
                    continue;      
                
                default:
                    System.out.println("You have choosen wrong option.");
                    break ;
            } 
            System.out.println("\n....DonE....\n");
                    break ;
            }
            
            
                   // break OUTER;
            else if(option == 2){
                    Scanner input3 = new Scanner(System.in);
            System.out.println("\n1.Food manu \n2.New Order");
            int option2 = input3.nextInt();
            switch (option2) {
                case 1:
                    DbConnect connect2 = new DbConnect();
                    connect2.getData2();
                    continue ;
                case 2:
                    DbConnect connect = new DbConnect();
                    connect.insertData2();
                    continue  ;
                   
                default:
                    System.out.println("You have choosen wrong option.");
                    break ;
            } 
                    //break OUTER;
                
                    System.out.println("\n....Thank You...\n");
                    break ;
            }
            else if(option ==3)
            {
                System.out.println("\n....Thank You...\n");
                break;
            }
        }
        
        
    }
    
}
