/*
 *Write a java GUI application using swing to populate the list of employees
 *in the organization from the MySql database...
 */
package employeeapp;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;


public class EmployeeApp {
    
    //jdbc driver name and database url
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/testing";
    //  Database credentials
    static final String USER = "Saswatika";
    static final String PASS = "Saswatika21*";
   
   
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
       
        try{
             //Register JDBC driver
             Class.forName("com.mysql.jdbc.Driver");

            //Open a connection
             System.out.println("Connecting to a selected database...");
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
             System.out.println("Connected database successfully...");
             System.out.println("Creating statement...");
             stmt = conn.createStatement();
      
            //Execute a query
            // String sqlin="insert into employee (ID,NAME,GENDER,PHONE) values(6, 'SASWATIKA', 'FEMALE',1234567900)";   
            // stmt.execute(sqlin);

             String sql= "select * from employee";
             ResultSet rs = stmt.executeQuery(sql);
             // Extract data from result set
             JFrame frame= new JFrame();
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setSize(300,300);
      
            JPanel panel= new JPanel(new GridLayout(2,2));
            JLabel datalabel= new JLabel();
            String st="<html>";
            panel.add(datalabel);
            frame.add(panel);
             while(rs.next()){
                //Retrieve by column name
                 int ID  = rs.getInt("ID");
                 String NAME = rs.getString("NAME");
                 st+= "ID:" + ID + ", NAME: " + NAME ;
                 st+= " <br>";
             }
             st+= "</html>";
             datalabel.setText(st);
             frame.setVisible(true);
             rs.close();
            }catch(SQLException se){
                se.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }finally{
            try{
                if(stmt!=null)
                    stmt.close();
                }catch(SQLException se2){
             }
            try{
            if(conn!=null)
            conn.close();
            }catch(SQLException se){
             se.printStackTrace();
            }
        }
        
      
        }
    }
    

