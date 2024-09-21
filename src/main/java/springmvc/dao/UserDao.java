package springmvc.dao;

import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class UserDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Transactional
    public int saveUser(User user) {
        int newId = (Integer) hibernateTemplate.save(user);
        return newId;
    }
}
