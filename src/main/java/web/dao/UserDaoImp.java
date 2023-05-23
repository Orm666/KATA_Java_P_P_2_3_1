package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    public void update(User user) {
        System.out.println(user.getId());
        em.merge(user);
    }

    @Override
    public void remove(Long id) {
        em.remove(getById(id));
    }

    @Override
    public User getById(Long id) {
        TypedQuery<User> query = em.createQuery("select u from User u where u.id = ?1", User.class);
        return query.setParameter(1, id).getSingleResult();
    }
}
