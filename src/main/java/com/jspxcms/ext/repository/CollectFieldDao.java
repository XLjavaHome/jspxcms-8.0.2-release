package com.jspxcms.ext.repository;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.ext.domain.CollectField;
import com.jspxcms.ext.repository.plus.CollectFieldDaoPlus;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CollectFieldDao extends Repository<CollectField, Integer>, CollectFieldDaoPlus {
    public List<CollectField> findAll(Specification<CollectField> spec, Sort sort);

    public List<CollectField> findAll(Specification<CollectField> spec, Limitable limit);

    public CollectField findOne(Integer id);

    public CollectField save(CollectField bean);

    public void delete(CollectField bean);
    // --------------------
}
