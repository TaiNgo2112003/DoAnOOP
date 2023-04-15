/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;


public class KetNoicsdl 
{ protected Connection con=null;
    public KetNoicsdl()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

          
            String connectionurl= "jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhoMayTinhh;user=sa;password=123;encrypt=true;"
                   + "trustServerCertificate=true";
            con=DriverManager.getConnection(connectionurl,"sa","123");
        }
           catch(Exception ex)
            {
                ex.printStackTrace();
            }        
    }
    
}
