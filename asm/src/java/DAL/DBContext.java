/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DBContext {
    protected Connection connection;
    public DBContext(){
        try{
            String url="jdbc:sqlserver://localhost:1433;databaseName=ASM1_1";
            String username="sa";
            String password="12345678";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
    }
}
