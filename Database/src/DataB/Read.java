package DataB;

import java.sql.*;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String Data = "select * from data";
		
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
			int inDate = Sc.nextInt();*/
			
			Stm.executeUpdate("Select NIS from data_table ('"+inNIS+"')");
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
