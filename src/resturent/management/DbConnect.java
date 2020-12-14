
package resturent.management;

import java.sql.*;
import java.util.Scanner;


public class DbConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DbConnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant_management?"+"user=root");
            st = con.createStatement();
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void getData()
    {
        try{
            String query = "SELECT * from order_list";
            rs = st.executeQuery(query);
            while(rs.next()){
                
                System.out.println("Customer ID: " + rs.getString("customer_id"));
                System.out.println("Item: " + rs.getString("item"));
                System.out.println("QTY: " + rs.getString("qty"));
                System.out.println("Order Date: " + rs.getString("order_date"));
            }
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void getData2()
    {
        try{
            String query = "SELECT * from food_manu";
            rs = st.executeQuery(query);
            while(rs.next()){
                
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Item: " + rs.getString("item"));
                System.out.println("Unit Price: " + rs.getString("unit_price"));
                System.out.println("Available Time: " + rs.getString("available_time"));
            }
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void insertData()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Item name :");
            String item=sc.nextLine();
            System.out.println("unit price :");
            int unit_price = sc.nextInt();
            sc.nextLine();
            System.out.println("Available time :");
            String available_time = sc.nextLine();
            st.executeUpdate("INSERT INTO food_manu(item,unit_price,available_time) VALUES('"+item+"','"+unit_price+"','"+available_time+"')");
            System.out.println("Values Added Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void insertData2()
    {
        
        try{
            Scanner sca = new Scanner(System.in);
            
            System.out.println("Customer Id :");
            int customer_id =sca.nextInt();
            
            sca.nextLine();
            System.out.println("Item name :");
            String item = sca.nextLine();
             
            System.out.println("QTY :");
            int qty  = sca.nextInt();
            sca.nextLine();
             
            System.out.println("Order Date :");
            String order_date = sca.nextLine();
             
            st.executeUpdate("INSERT INTO order_list(customer_id,item,qty,order_date) VALUES('"+customer_id+"','"+item+"','"+qty+"','"+order_date+"')");
            System.out.println("Thank you !!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void upDate()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Item name :");
            String item=sc.nextLine();
            System.out.println("Update price :");
            int unit_price = sc.nextInt();
            st.executeUpdate("UPDATE food_manu SET unit_price = '"+unit_price+"'WHERE item ='"+item+"'");
            System.out.println("Values Update Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void delete()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Item name :");
            String item=sc.nextLine();
           
            st.executeUpdate("DELETE FROM food_manu WHERE item ='"+item+"'");
            System.out.println("Values Delete Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
}
