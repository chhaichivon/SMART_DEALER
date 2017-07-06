package com.smartdealer.core.repository.user;

import com.smartdealer.core.models.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/6/2017
 * TIME   : 10:40 AM
 */
@Repository
public class UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public User getUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class , id);
    }

    @Transactional
    public Collection<User> getListUser() {
        return sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }

    @Transactional
    public void saveOrUpdateUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }


    @Transactional
    public void delete(Long id) {
        User user = sessionFactory.getCurrentSession().get(User.class,id);
        sessionFactory.getCurrentSession().delete(user);
    }
}
