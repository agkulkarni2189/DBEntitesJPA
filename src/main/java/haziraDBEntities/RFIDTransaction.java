package haziraDBEntities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: RFIDTransaction
 *
 */
@Entity
@Table
public class RFIDTransaction implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rfid_transaction_id;
	private int tag_id;
	private int boom_up_request_source;
	private Date ack_sent_time;
	private Date hht_boomup_request_recd_time;
	private Date rfid_boomup_request_recd_time;
	private String lane_name;
	private int lane_id;
	private String location_name;
	private int location_id;
	private String lane_type_name;
	private int lane_type_id;
	
	//private static final long serialVersionUID = 1L;

	public RFIDTransaction() {
		super();
	}

	public int getTag_id() {
		return tag_id;
	}

	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}

	public int getBoom_up_request_source() {
		return boom_up_request_source;
	}

	public void setBoom_up_request_source(int boom_up_request_source) {
		this.boom_up_request_source = boom_up_request_source;
	}

	public Date getAck_sent_time() {
		return ack_sent_time;
	}

	public void setAck_sent_time(Date ack_sent_time) {
		this.ack_sent_time = ack_sent_time;
	}

	public Date getHht_boomup_request_recd_time() {
		return hht_boomup_request_recd_time;
	}

	public void setHht_boomup_request_recd_time(Date hht_boomup_request_recd_time) {
		this.hht_boomup_request_recd_time = hht_boomup_request_recd_time;
	}

	public Date getRfid_boomup_request_recd_time() {
		return rfid_boomup_request_recd_time;
	}

	public void setRfid_boomup_request_recd_time(Date rfid_boomup_request_recd_time) {
		this.rfid_boomup_request_recd_time = rfid_boomup_request_recd_time;
	}

	public String getLane_name() {
		return lane_name;
	}

	public void setLane_name(String lane_name) {
		this.lane_name = lane_name;
	}

	public int getLane_id() {
		return lane_id;
	}

	public void setLane_id(int lane_id) {
		this.lane_id = lane_id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getLane_type_name() {
		return lane_type_name;
	}

	public void setLane_type_name(String lane_type_name) {
		this.lane_type_name = lane_type_name;
	}

	public int getLane_type_id() {
		return lane_type_id;
	}

	public void setLane_type_id(int lane_type_id) {
		this.lane_type_id = lane_type_id;
	}
   
}
