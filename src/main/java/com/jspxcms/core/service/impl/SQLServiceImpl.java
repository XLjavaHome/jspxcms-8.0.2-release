package com.jspxcms.core.service.impl;

import com.jspxcms.core.repository.SQLDao;
import com.jspxcms.core.service.SQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * SQLServiceImpl
 *
 * @author liufang
 */
@Service
@Transactional(readOnly = true)
public class SQLServiceImpl implements SQLService {
    public List<?> query(String sql, Integer maxRows, Integer startRow) {
        return dao.query(sql, maxRows, startRow);
    }

    public int update(String sql) {
        return dao.update(sql);
    }

    private SQLDao dao;

    @Autowired
    public void setDao(SQLDao dao) {
        this.dao = dao;
    }
}
