package com.jspxcms.core.repository.impl;

import com.jspxcms.core.repository.SQLDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * SQLDaoImpl
 *
 * @author liufang
 */
@Repository
public class SQLDaoImpl implements SQLDao {
    public List<?> query(String sql, Integer maxRows, Integer startRow) {
        Query query = em.createNativeQuery(sql);
        if (maxRows != null) {
            query.setMaxResults(maxRows);
        }
        if (startRow != null) {
            query.setFirstResult(startRow);
        }
        return query.getResultList();
    }

    public int update(String sql) {
        return em.createNativeQuery(sql).executeUpdate();
    }

    private EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
