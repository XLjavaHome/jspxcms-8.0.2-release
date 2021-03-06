package com.jspxcms.core.repository;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.core.domain.WorkflowStep;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface WorkflowStepDao extends Repository<WorkflowStep, Integer> {
    public List<WorkflowStep> findAll(Specification<WorkflowStep> spec, Sort sort);

    public List<WorkflowStep> findAll(Specification<WorkflowStep> spec, Limitable limit);

    public WorkflowStep findOne(Integer id);

    public WorkflowStep save(WorkflowStep bean);

    public void delete(WorkflowStep bean);
    // --------------------
}
