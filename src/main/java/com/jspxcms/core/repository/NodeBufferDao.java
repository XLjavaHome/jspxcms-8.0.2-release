package com.jspxcms.core.repository;

import com.jspxcms.core.domain.NodeBuffer;
import org.springframework.data.repository.Repository;

/**
 * NodeBufferDao
 *
 * @author liufang
 */
public interface NodeBufferDao extends Repository<NodeBuffer, Integer> {
    public NodeBuffer findOne(Integer id);

    public NodeBuffer save(NodeBuffer bean);
}
