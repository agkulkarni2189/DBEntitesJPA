package haziraDBAPIs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import haziraDBEntities.LaneType;

public class LaneTypeAPI {
	
	private EntityManagerFactory emfac = null;
	private EntityManager TransactionManager = null;
	
	public LaneTypeAPI() {
		// TODO Auto-generated constructor stub
		emfac = Persistence.createEntityManagerFactory("AHPPLDBJpaProject");
		TransactionManager = emfac.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<LaneType> getAllLaneTypes() {
		Query LaneTypesSelectQuery = TransactionManager.createNativeQuery("SELECT ltm.lane_type_id, ltm.lane_type_name FROM lane_type_master ltm", LaneType.class);
		return LaneTypesSelectQuery.getResultList();
	}
}
