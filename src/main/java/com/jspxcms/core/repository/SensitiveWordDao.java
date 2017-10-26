package com.jspxcms.core.repository;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.core.domain.SensitiveWord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface SensitiveWordDao extends Repository<SensitiveWord, Integer> {
    public Page<SensitiveWord> findAll(Specification<SensitiveWord> spec, Pageable pageable);

    public List<SensitiveWord> findAll(Specification<SensitiveWord> spec, Limitable limitable);

    public SensitiveWord findOne(Integer id);

    public SensitiveWord save(SensitiveWord bean);

    public void delete(SensitiveWord bean);
    // --------------------

    public List<SensitiveWord> findByStatus(int status);
}
