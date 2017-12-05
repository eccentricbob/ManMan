package uk.co.madbob.ManMan;

/**
 * Describes a single maneuver
 * 
 * @author donald
 *
 */
public class Maneuver {

	private String name;
	private int level;
	private int discipline;
	private ManeuverType type;
	private String description;

	/* Access methods */

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the discipline
	 */
	public int getDiscipline() {
		return discipline;
	}

	/**
	 * @param discipline
	 *            the discipline to set
	 */
	public void setDiscipline(int discipline) {
		this.discipline = discipline;
	}

	/**
	 * @return the type
	 */
	public ManeuverType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(ManeuverType type) {
		this.type = type;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* End access methods */

	/**
	 * Creates a new Maneuver object given all the relevant data
	 * 
	 * @param name
	 * @param level
	 * @param discipline
	 * @param type
	 * @param description
	 */
	public Maneuver(String name, int level, int discipline, ManeuverType type, String description) {

		this.name = name;
		this.level = level;
		this.discipline = discipline;
		this.type = type;
		this.description = description;
	}

}
