package com.student.manage;
import java.sql.*;


public class StudentDao {
    static boolean f = false;

    public static boolean insertStudentToDB(Student st) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = ConnectionProvider.createC();
            String q = "insert into students(name,phone,age) values(?,?,?)";
            pst = con.prepareStatement(q);

            pst.setString(1, st.getName());
            pst.setString(2, st.getPhone());
            pst.setInt(3, st.getAge());

            pst.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return f;
    }

    public static boolean deleteStudentFromDB(int userId) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = ConnectionProvider.createC();
            String q = "delete from students where id=?";
            pst = con.prepareStatement(q);
pst.setInt(1,userId);

            pst.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean DisplayStudentFromDB() {

        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = ConnectionProvider.createC();
            String q = "SELECT * FROM students;";
         Statement stm = con.createStatement();
      ResultSet result =    stm.executeQuery(q);

      while(result.next()){
          int id = result.getInt(1);
          String name = result.getString(2);
          String phone = result.getString(3);
          int age = result.getInt(4);

          System.out.println("ID :-" + id);
          System.out.println("Name :-" + name);
          System.out.println("phone:-" + phone);
          System.out.println("Age:-" + age);
          System.out.println("+++++++++++++++++++++");

      }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
