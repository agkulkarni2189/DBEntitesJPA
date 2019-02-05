package haziraDBEntities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Lane
 *
 */
@Entity
@Table
public class Lane implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4620744135373520431L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lane_id;
	private String lane_name;

	public Lane() {
		super();
	}
	
	public int getLane_id() {
		return lane_id;
	}
	
	public void setLane_id(int lane_id)
	{
		this.lane_id = lane_id;
	}
	
	public String getLane_name() {
		return lane_name;
	}

	public void setLane_name(String lane_name) {
		this.lane_name = lane_name;
	}
}
