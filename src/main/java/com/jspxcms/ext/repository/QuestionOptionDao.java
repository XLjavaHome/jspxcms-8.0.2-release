package com.jspxcms.ext.repository;

import com.jspxcms.common.orm.Limitable;
import com.jspxcms.ext.domain.QuestionOption;
import com.jspxcms.ext.repository.plus.QuestionOptionDaoPlus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface QuestionOptionDao extends Repository<QuestionOption, Integer>, QuestionOptionDaoPlus {
    public Page<QuestionOption> findAll(Specification<QuestionOption> spec, Pageable pageable);

    public List<QuestionOption> findAll(Specification<QuestionOption> spec, Limitable limitable);

    public QuestionOption findOne(Integer id);

    public QuestionOption save(QuestionOption bean);

    public void delete(QuestionOption bean);
    // --------------------
}
