package com.jspxcms.core.repository;

import com.jspxcms.core.domain.InfoBuffer;
import org.springframework.data.repository.Repository;

/**
 * InfoBufferDao
 *
 * @author liufang
 */
public interface InfoBufferDao extends Repository<InfoBuffer, Integer> {
    public InfoBuffer findOne(Integer id);

    public InfoBuffer save(InfoBuffer bean);
}
