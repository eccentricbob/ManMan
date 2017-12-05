/**
 * 
 */
package uk.co.madbob.ManMan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Donald
 *
 */
public class ManManMain {

	private static List<Discipline> AllDisciplines = new ArrayList<Discipline>();
	
	private static final String GetDisciplinesSQL = "SELECT id, name, description FROM disciplines;";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ManMan started");
		
		//Connect to database
		Connection conn = null;
		
		String dbUrl = "jdbc:sqlite:manman.db";
				
		try {
			conn = DriverManager.getConnection(dbUrl);
			
			System.out.println("Connected to DB");

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(GetDisciplinesSQL);
			
			while(rs.next()) {
				AllDisciplines.add(new Discipline(rs.getInt("id"), rs.getString("name"), rs.getString("description")));
			}
		} catch (SQLException e) {
            System.out.println(e.getMessage());
		} finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
		}


		// Check the disciplines
		
		for (Discipline discipline : AllDisciplines) {
			System.out.println(discipline.toString());
		}
		
		// Loop
		//  Show menu
		//  Wait for input
		//	Do stuff
		
		
	}

}
