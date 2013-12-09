package timetable;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class AdminDao {
    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(Admin admin) {
        em.persist(admin);
    }
 
    public List<Admin> getAllSession() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT a FROM Admin a", Admin.class);
        return query.getResultList();
    }
    
    public Admin viewSession(long id) {
    	TypedQuery<Admin> query = em.createQuery
    			("SELECT a FROM Admin a where a.id =:id", Admin.class);
    	return query.setParameter("id", id).getSingleResult();
    }
    
    public List<Admin> viewWeeklySession(long id, String date) {
    	TypedQuery<Admin> query = em.createQuery
    			("SELECT a FROM Admin a where a.id =:id AND a.date =:date", Admin.class);
    	return query.setParameter("date", date).setParameter("id", id).getResultList();
    }
}