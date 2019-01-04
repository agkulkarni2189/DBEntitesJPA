package haziraDBAPIs;

import javax.persistence.Persistence;

import haziraDBEntities.RFIDTransaction;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class TransactionAPI {
	private EntityManagerFactory emfac = null;
	private EntityManager TransactionManager = null;
	public TransactionAPI() {
		// TODO Auto-generated constructor stub
		emfac = Persistence.createEntityManagerFactory("AHPPLDBJpaProject");
		TransactionManager = emfac.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<RFIDTransaction> getRFIDTransactions(String LocationID, String LaneTypeID, String LaneID)
	{
		StringBuilder TransactionsRetrievalQuery = new StringBuilder();
		StringBuilder WhereConditions = new StringBuilder();
		
		TransactionsRetrievalQuery.append("WITH Lane_Trans_CTE AS(SELECT tt.rfid_transaction_id, tt.tag_id, tt.boom_up_request_source, tt.ack_sent_time, tt.hht_boomup_request_recd_time, tt.rfid_boomup_request_recd_time, lm.lane_name, lm.lane_id, lm.lane_type_id  FROM rfid_transaction_table tt LEFT OUTER JOIN lane_master lm ON tt.lane_id=lm.lane_id),Lane_Type_CTE AS(SELECT ltc.*, ltm.lane_type_name FROM Lane_Trans_CTE ltc LEFT OUTER JOIN lane_type_master ltm ON ltc.lane_type_id=ltm.lane_type_id), Location_Type_CTE AS(SELECT ltc.*, llm.location_id FROM Lane_Type_CTE ltc LEFT OUTER JOIN location_lane_type_mapping llm ON ltc.lane_type_id = llm.lane_type_id) SELECT ltc.rfid_transaction_id, ltc.tag_id,ltc.boom_up_request_source, ltc.ack_sent_time, ltc.hht_boomup_request_recd_time, ltc.rfid_boomup_request_recd_time, ltc.lane_name, ltc.lane_type_name, lm.location_name FROM Location_Type_CTE AS ltc LEFT OUTER JOIN location_master lm ON ltc.location_id = lm.location_id");
		
		if(LocationID != null && !LocationID.isEmpty())
		{
			if(WhereConditions.length() > 0)
				WhereConditions.append(" AND ltc.location_id="+LocationID);
			else
				WhereConditions.append(" WHERE ltc.location_id="+LocationID);
		}
		
		if(LaneTypeID != null && !LaneTypeID.isEmpty())
		{
			if(WhereConditions.length() > 0)
				WhereConditions.append(" AND ltc.lane_type_id="+LaneTypeID);
			else
				WhereConditions.append(" WHERE ltc.lane_type_id="+LaneTypeID);
		}
		
		if(LaneID != null && !LaneID.isEmpty())
		{
			if(WhereConditions.length() > 0)
				WhereConditions.append(" AND ltc.lane_id="+LaneID);
			else
				WhereConditions.append(" WHERE ltc.lane_id="+LaneID);
		}
		
		if(WhereConditions.length() > 0)
			TransactionsRetrievalQuery.append(WhereConditions.toString());
		
		javax.persistence.Query RFIDTransQuery = TransactionManager.createNativeQuery(TransactionsRetrievalQuery.toString(), RFIDTransaction.class);
		
		return RFIDTransQuery.getResultList();
	}
}
