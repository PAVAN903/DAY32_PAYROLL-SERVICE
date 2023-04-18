package com.bridgelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollservice", "root","Pavan123@t");
			Statement stmt = connection.createStatement();
			stmt.execute("select * from employeepayroll");
			//stmt.execute("delete from student where id=5");
			//stmt.execute("insert into student values('5','2023-01-01','ashu','english','zoology'");
			ResultSet result = stmt.executeQuery("select * from employeepayroll");
			while (result.next()) {
				System.out.println("id : " + result.getInt(1));
				System.out.println("name : " + result.getString(2));
				System.out.println("Gender : " + result.getString(3));
				System.out.println("salary : " + result.getString(4));
				System.out.println("startdate : " + result.getString(5));
				System.out.println("phonenumber : " + result.getInt(6));
				System.out.println("address : " + result.getString(7));
				System.out.println("department : " + result.getString(8));
				System.out.println("basicpay : " + result.getInt(9));
				System.out.println("deduction : " + result.getInt(10));
				System.out.println("taxablepay : " + result.getInt(11));
				System.out.println("incometax : " + result.getInt(12));
				System.out.println("netpay : " + result.getInt(13));
				
				
			}
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
