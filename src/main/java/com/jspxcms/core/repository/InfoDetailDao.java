package com.jspxcms.core.repository;

import com.jspxcms.core.domain.InfoDetail;
import org.springframework.data.repository.Repository;

/**
 * InfoDetailDao
 *
 * @author liufang
 */
public interface InfoDetailDao extends Repository<InfoDetail, Integer> {
    public InfoDetail findOne(Integer id);

    public InfoDetail save(InfoDetail bean);
}
