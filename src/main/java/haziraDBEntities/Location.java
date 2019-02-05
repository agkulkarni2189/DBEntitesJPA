package haziraDBEntities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Location
 *
 */
@Entity
@Table
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1812169480669175653L;
	// private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int location_id;
	private String location_name;

	public Location() {
		super();
	}
	
	public int getLocation_id()
	{
		return this.location_id;
	}
	
	public void setLocation_id(int location_id)
	{
		this.location_id = location_id;
	}
	
	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
}
