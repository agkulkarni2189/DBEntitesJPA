package haziraDBAPIs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import haziraDBEntities.Lane;

public class LaneAPI {
	
	private EntityManagerFactory emfac = null;
	private EntityManager TransactionManager = null;
	
	public LaneAPI() {
		// TODO Auto-generated constructor stub
		emfac = Persistence.createEntityManagerFactory("AHPPLDBJpaProject");
		TransactionManager = emfac.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Lane> getAllLanes() {
		Query LanesSelectQuery = TransactionManager.createNativeQuery("SELECT lm.lane_id, lm.lane_name FROM lane_master lm", Lane.class);
		return LanesSelectQuery.getResultList();
	}
}
