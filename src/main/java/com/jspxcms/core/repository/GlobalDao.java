package com.jspxcms.core.repository;

import com.jspxcms.core.domain.Global;
import org.springframework.data.repository.Repository;

/**
 * GlobalDao
 *
 * @author liufang
 */
public interface GlobalDao extends Repository<Global, Integer> {
    public Global findOne(Integer id);

    public Global save(Global entity);
}