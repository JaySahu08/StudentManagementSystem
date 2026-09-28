package org.management;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DB {

    public static boolean insert(Student st){
        boolean f = false;
        try{
            Connection con = CP.createc();
            String q = "insert into student(name , phone , city) values(? , ? , ?)";

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1 , st.getStudentName());
            pstmt.setString(2 , st.getStudentPhone());
            pstmt.setString(3 , st.getStudentCity());

            pstmt.executeUpdate();
            f = true;
        }catch(Exception e){
            e.printStackTrace();
        }

        return f;
    }


}
