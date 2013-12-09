package timetable;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class UserDao {
    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(User user) {
        em.persist(user);
    }
 
    // Retrieves all the guests:
    public List<User> getAllSession() {
        TypedQuery<User> query = em.createQuery(
            "SELECT a FROM User a", User.class);
        return query.getResultList();
    }
}