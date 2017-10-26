package com.jspxcms.core.service;

import com.jspxcms.common.orm.RowSide;
import com.jspxcms.core.domain.WorkflowGroup;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;

/**
 * WorkflowGroupService
 *
 * @author liufang
 */
public interface WorkflowGroupService {
    public List<WorkflowGroup> findList(Integer siteId, Map<String, String[]> params, Sort sort);

    public RowSide<WorkflowGroup> findSide(Integer siteId, Map<String, String[]> params, WorkflowGroup bean, Integer position, Sort sort);

    public List<WorkflowGroup> findList(Integer siteId);

    public WorkflowGroup get(Integer id);

    public WorkflowGroup save(WorkflowGroup bean, Integer siteId);

    public WorkflowGroup update(WorkflowGroup bean);

    public WorkflowGroup delete(Integer id);

    public WorkflowGroup[] delete(Integer[] ids);
}
