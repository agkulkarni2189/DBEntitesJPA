package haziraDBEntities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LaneType
 *
 */
@Entity

public class LaneType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5389604868960031583L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lane_type_id;
	private String lane_type_name;

	public LaneType() {
		super();
	}
	
	public int getLane_type_id()
	{
		return this.lane_type_id;
	}
	
	public void setLane_type_id(int lane_type_id)
	{
		this.lane_type_id = lane_type_id;
	}
	
	public String getLane_type_name() {
		return lane_type_name;
	}

	public void setLane_type_name(String lane_type_name) {
		this.lane_type_name = lane_type_name;
	}
}
