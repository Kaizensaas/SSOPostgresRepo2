package com.spring.security.social.login.example.database.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.spring.security.social.login.example.database.model.Usersocial;


/**
 * @author <a href="mailto:psunil1278@gmail.com">Sunil Kumar</a>
 * @since 26/12/15
 */
@Service
public class UserDAO implements GenericDao<Usersocial,String> {

    @Autowired
    private HibernateTemplate template;

    @Override
    public Usersocial load(final String id) {
        return template.load(Usersocial.class,id);
    }

    @Override
    public Usersocial get(final String id) {
        return template.get(Usersocial.class,id);
    }

    @Override
    public List<Usersocial> getAll() {
        return template.loadAll(Usersocial.class);
    }

    @Override
    public Serializable save(final Usersocial object) {
        return template.save(object);
    }

    @Override
    public void saveOrUpdate(final Usersocial object) {
        template.saveOrUpdate(object);
    }

    @Override
    public void delete(final Usersocial object) {
        template.delete(object);
    }

    @Override
    public Long count() {
        return new Long(template.loadAll(Usersocial.class).size());
    }

    @Override
    public void flush() {
        template.flush();
    }

}
