package DataB;

import java.sql.*;
import java.util.Scanner;

public class Update {
	//update
	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_Data","root","modernwarfare");	
			Statement Stm = con.createStatement();
			System.out.println("input Name");
			String inName = Sc.next();
			System.out.println("Input NIS: ");
			int inNIS = Sc.nextInt();
			/*System.out.println("Input Class");
			String inClass = Sc.next();
			System.out.println("Input Date of Birth");
			String inDate = Sc.next();*/
			
			
			Stm.executeUpdate("update data set Name = '"+inName+"' where NIS = '"+inNIS+"' ");
			System.out.println("Succes");
		}
		catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}