package com.jspxcms.core.service;

import com.jspxcms.core.domain.Info;
import com.jspxcms.core.domain.InfoNode;

import java.util.Collection;
import java.util.List;

public interface InfoNodeService {
    public List<InfoNode> update(Info info, Integer[] nodeIds, Integer nodeId);

    public int moveByNodeId(Collection<Integer> nodeIds, Integer nodeId);

    public void deleteByNodeId(Integer nodeId);
}
