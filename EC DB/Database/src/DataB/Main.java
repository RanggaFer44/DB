package DataB;

import java.sql.*;
import java.util.Scanner;

public class Main {
	//Input Data
	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		/*boolean Bl;
		
		while(Bl = true) {
			
		}*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_Data","root","modernwarfare");	
			Statement Stm = con.createStatement();
			System.out.println("Input NIS: ");
			int inNIS = Sc.nextInt();
			System.out.println("input Name");
			String inName = Sc.next();
			System.out.println("Input Class");
			String inClass = Sc.next();
			System.out.println("Input Date of Birth");
			int inDate = Sc.nextInt();
			
			
			Stm.executeUpdate("insert into data_Table value ('"+inNIS+"','"+inName+"','"+inClass+"','"+inDate+"')");
			/*String Chk = "select NIS from data_table where NIS='"+inNIS+"'";
			
			ResultSet Rs = Stm.executeQuery(Chk);*/
			
				System.out.println("Succes");
			
		}catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Sc.close();
		}
		
		
		
		
	}
	
	
}
