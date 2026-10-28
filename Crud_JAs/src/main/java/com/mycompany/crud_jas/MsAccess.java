package com.mycompany.Crud_JAs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MsAccess {

    public static Connection conn() {

        try {

            String url = "jdbc:ucanaccess://C:\\Users\\CL2-PC\\Documents\\student_crud.accdb";

            Connection conn = DriverManager.getConnection(url);

            System.out.println("Connected to MS Access!");

            return conn;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null,
                    "Database Connection Error:\n" + e.getMessage());

            return null;
        }
    }
}