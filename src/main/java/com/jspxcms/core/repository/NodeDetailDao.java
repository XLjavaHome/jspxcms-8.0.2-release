package com.jspxcms.core.repository;

import com.jspxcms.core.domain.NodeDetail;
import org.springframework.data.repository.Repository;

/**
 * NodeDetailDao
 *
 * @author liufang
 */
public interface NodeDetailDao extends Repository<NodeDetail, Integer> {
    public NodeDetail findOne(Integer id);

    public NodeDetail save(NodeDetail bean);
}
