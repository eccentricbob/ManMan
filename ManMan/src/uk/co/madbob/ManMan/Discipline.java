/**
 * 
 */
package uk.co.madbob.ManMan;

import java.text.MessageFormat;

/**
 * Discipline class - Represents a discipline, a style of maneuvers
 * 
 * @author donald
 *
 */
public class Discipline {

	int id;
	String name;
	String description;
	
	// List<Maneuver> disciplineManeuvers;
	
	public Discipline(int id, String name, String description) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		
	}
	
	public String toString() {
		return MessageFormat.format("Discipline - id: {0}, name: {1}, description: {2}" , Integer.toString(id), name, description);
	}
	
}
