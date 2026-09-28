package org.management;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    static Connection co;
    public static Connection createc(){
        try{
            Class.forName("org.postgresql.Driver");
            String user = "postgres";
            String pass = "9425644322";
            String url = "jdbc:postgresql://localhost:5432/student_management";

            co = DriverManager.getConnection(url , user , pass);

        }catch(Exception e){
            e.printStackTrace();
        }

        return co;
    }
}
