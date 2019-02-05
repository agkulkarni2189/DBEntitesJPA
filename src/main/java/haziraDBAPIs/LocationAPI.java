package haziraDBAPIs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import haziraDBEntities.Location;

public class LocationAPI {
	
	private EntityManagerFactory emfac = null;
	private EntityManager TransactionManager = null;
	
	public LocationAPI() {
		// TODO Auto-generated constructor stub
		emfac = Persistence.createEntityManagerFactory("AHPPLDBJpaProject");
		TransactionManager = emfac.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Location> getAllLocations() {
		Query LocationSelectQuery = TransactionManager.createNativeQuery("SELECT lm.location_id, lm.location_name FROM location_master lm", Location.class);
		return LocationSelectQuery.getResultList();
	}
}
