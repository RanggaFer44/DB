package DataB;

import java.sql.*;
import java.util.Scanner;

public class Delet {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_Data","root","modernwarfare");	
			Statement Stm = con.createStatement();
			System.out.println("Input NIS: ");
			int inNIS = Sc.nextInt();
			/*System.out.println("input Name");
			String inName = Sc.next();
			System.out.println("Input Class");
			String inClass = Sc.next();
			System.out.println("Input Date of Birth");
			String inDate = Sc.next();*/
			
			
			//String QCheck = "select NIS from data where exist (NIS = '"+inNIS+"')";
			String QCheck = "select * from data_table where NIS = '"+inNIS+"'";
			
			ResultSet Rs = Stm.executeQuery(QCheck);
			
			
			if(Rs.next()) {
				Stm.executeUpdate("Delete from data_table where NIS = '"+inNIS+"' ");
				System.out.println("Succes");				
			}else {
				System.out.println("Data Not Found");
			}
			
		}
		catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
