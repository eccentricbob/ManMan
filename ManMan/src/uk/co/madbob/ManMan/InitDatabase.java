/**
 * 
 */
package uk.co.madbob.ManMan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author donald
 *
 */
public class InitDatabase {

	public static final String CreateDisciplinesSQL = "CREATE TABLE IF NOT EXISTS disciplines \n"
			+ "( \n"
			+ "id INTEGER PRIMARY KEY AUTOINCREMENT, \n"
			+ "name VARCHAR NOT NULL, \n"
			+ "description VARCHAR \n"
			+ ");";
					
	public static final String PopulateDisciples = "DELETE FROM disciplines;"
			+ "INSERT INTO disciplines (name, description) \n"
			+ "VALUES \n"
			+ "( 'Black Seraph', NULL ), \n"
			+ "( 'Broken Blade', NULL ), \n"
			+ "( 'Cursed Razor', NULL ), \n"
			+ "( 'Elemental Flux', NULL ), \n"
			+ "( 'Eternal Guardian', NULL ), \n"
			+ "( 'Golden Lion', NULL ), \n"
			+ "( 'Iron Tortoise', NULL ), \n"
			+ "( 'Mithral Current', NULL ), \n"
			+ "( 'Piercing Thunder', NULL ), \n"
			+ "( 'Primal Fury', NULL ), \n"
			+ "( 'Riven Hourglass', NULL ), \n"
			+ "( 'Scarlet Throne', NULL ), \n"
			+ "( 'Shattered Mirror', NULL ), \n"
			+ "( 'Silver Crane', NULL ), \n"
			+ "( 'Sleeping Goddess', NULL ), \n"
			+ "( 'Solar Wind', NULL ), \n"
			+ "( 'Steel Serpent', NULL ), \n"
			+ "( 'Tempest Gale', NULL ), \n"
			+ "( 'Thrashing Dragon', NULL ), \n"
			+ "( 'Veiled Moon', NULL ); \n";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Connect to database
		Connection conn = null;
		
		String dbUrl = "jdbc:sqlite:manman.db";
				
		try {
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connected to DB");
			
			Statement stmt = conn.createStatement();
			System.out.println("Creating table");
			stmt.executeUpdate(CreateDisciplinesSQL);

			System.out.println("Populating table");
			stmt.executeUpdate(PopulateDisciples);
			
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
		

	}

}
